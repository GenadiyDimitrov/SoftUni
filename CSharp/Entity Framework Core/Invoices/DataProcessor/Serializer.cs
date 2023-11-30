namespace Invoices.DataProcessor
{
    using Invoices.Data;
    using Invoices.Data.Models;
    using Microsoft.EntityFrameworkCore.Metadata.Internal;
    using Microsoft.EntityFrameworkCore;
    using System.Diagnostics;
    using Invoices.DataProcessor.ExportDto;
    using Microsoft.Data.SqlClient.Server;
    using System.Collections.Generic;
    using System.Diagnostics.Metrics;
    using System.Globalization;

    public class Serializer
    {
        public static string ExportClientsWithTheirInvoices(InvoicesContext context, DateTime date)
        {
            var tmp = context.Clients
                .Where(c => c.Invoices.Any(i => i.IssueDate > date))
                .Select(c => new ExportClientsDto()
                {
                    Name = c.Name,
                    NumberVat = c.NumberVat,
                    InvoicesCount = c.Invoices.Count,
                    Invoices = c.Invoices
                    .OrderBy(i => i.IssueDate)
                    .ThenByDescending(i => i.DueDate)
                    .Select(i => new ExportInvoiceDto()
                    {
                        Currency = i.CurrencyType.ToString(),
                        DueDate = i.DueDate.ToString("MM/dd/yyyy"),
                        InvoiceAmount = decimal.Parse(i.Amount.ToString("0.##")),
                        InvoiceNumber = i.Number,
                    })
                    .ToArray(),
                })
                .OrderByDescending(c => c.InvoicesCount)
                .ThenBy(c => c.Name)
                .ToArray();

            return tmp.SerializeToXml("Clients");
        }
        public static string ExportProductsWithMostClients(InvoicesContext context, int nameLength)
        {
            var tmp = context.Products
                .Where(p => p.ProductsClients.Any(pc => pc.Client.Name.Length >= nameLength))
                .Include(p => p.ProductsClients)
                .ThenInclude(p => p.Client)
                .ToArray()
                .Select(p => new ExportProductDto()
                {
                    Name = p.Name,
                    Category = p.CategoryType.ToString(),
                    Price = decimal.Parse(p.Price.ToString("0.##")),
                    Clients = p.ProductsClients
                                .Where(pc => pc.Client.Name.Length >= nameLength)
                                .Select(pc => new ExportClientsDto()
                                {
                                    Name = pc.Client.Name,
                                    NumberVat = pc.Client.NumberVat,
                                })
                                .OrderBy(p => p.Name)
                                .ToArray()

                })
                .OrderByDescending(p => p.Clients.Length)
                .ThenBy(p => p.Name)
                .Take(5)
                .ToArray()
                ;

            return tmp.SerializeToJson();
        }
    }
}