using SoftUni.Data;
using Microsoft.EntityFrameworkCore;
using SoftUni.Models;
using Microsoft.VisualBasic;
using Microsoft.EntityFrameworkCore.Infrastructure;
using System.Collections.Generic;
using System.Runtime.ConstrainedExecution;

namespace SoftUni
{
    public class StartUp
    {
        public static void Main(string[] args)
        {
            SoftUniContext context = new();
            Console.WriteLine(GetDepartmentsWithMoreThan5Employees(context));
        }
        public static string GetEmployeesFullInformation(SoftUniContext context)
        {
            var employees = context.Employees
                .Select(e =>
                    new
                    {
                        e.FirstName,
                        e.LastName,
                        e.MiddleName,
                        e.JobTitle,
                        e.Salary
                    })
                .ToArray()
                .Select(e => $"{e.FirstName} {e.LastName} {e.MiddleName} {e.JobTitle} {e.Salary:F2}");

            return string.Join(Environment.NewLine, employees);
        }
        public static string GetEmployeesWithSalaryOver50000(SoftUniContext context)
        {
            var employees = context.Employees
                .Select(e => e.Salary > 50000 ?
                    new
                    {
                        e.FirstName,
                        e.Salary
                    } : null)
                .ToList();
            employees.RemoveAll(e => e is null);
            var selected = employees.OrderBy(e => e.FirstName)
                                    .Select(e => $"{e.FirstName} - {e.Salary:F2}");

            return string.Join(Environment.NewLine, selected);
        }
        public static string GetEmployeesFromResearchAndDevelopment(SoftUniContext context)
        {
            var employees = context.Employees
                .Select(e => e.Department.Name == "Research and Development" ?
                    new
                    {
                        e.FirstName,
                        e.LastName,
                        e.Department,
                        e.Salary
                    } : null)
                .ToList();
            employees.RemoveAll(e => e is null);
            var selected = employees.OrderBy(e => e.Salary)
                                    .ThenByDescending(e => e.FirstName)
                                    .Select(e => $"{e.FirstName} {e.LastName} from {e.Department.Name} - ${e.Salary:F2}");

            return string.Join(Environment.NewLine, selected);
        }
        public static string AddNewAddressToEmployee(SoftUniContext context)
        {
            Address address = new()
            {
                TownId = 4,
                AddressText = "Vitoshka 15"
            };
            var employee = context.Employees.FirstOrDefault(e => e.LastName == "Nakov");

            employee.Address = address;

            context.SaveChanges();
            var employees = context.Employees
                            .Select(e =>
                                new
                                {
                                    e.AddressId,
                                    e.Address.AddressText
                                })
                            .OrderByDescending(e => e.AddressId)
                            .Take(10)
                            .ToList();

            return string.Join(Environment.NewLine, employees.Select(e => e.AddressText));
        }
        public static string GetEmployeesInPeriod(SoftUniContext context)
        {
            var employees = context.Employees
                            .Select(e =>
                                new
                                {
                                    e.FirstName,
                                    e.LastName,
                                    e.Manager,
                                    e.EmployeesProjects
                                })
                            .Take(10)
                            .ToList();
            var projects = context.Projects.ToDictionary(k => k.ProjectId, p => p);
            List<string> strings = new();
            foreach (var employee in employees)
            {
                strings.Add($"{employee.FirstName} {employee.LastName} - Manager: {employee.Manager.FirstName} {employee.Manager.LastName}");
                foreach (var projectId in employee.EmployeesProjects.Select(ep => ep.ProjectId))
                {
                    if (projects.TryGetValue(projectId, out var project))
                    {
                        if (project.StartDate.Year >= 2001 && project.StartDate.Year <= 2003)
                        {
                            strings.Add($"--{project.Name} - {project.StartDate:M/d/yyyy h:mm:ss} {(project.StartDate.TimeOfDay.Hours > 12 ? "PM" : "AM")} - {(project.EndDate == null ? "not finished" : $"{project.EndDate:M/d/yyyy h:mm:ss} {(project.StartDate.TimeOfDay.Hours > 12 ? "PM" : "AM")}")}");
                        }
                    }
                }
            }
            return string.Join(Environment.NewLine, strings);
        }
        public static string GetAddressesByTown(SoftUniContext context)
        {
            var addresses = context.Addresses
                            .OrderByDescending(e => e.Employees.Count)
                            .ThenBy(e => e.Town.Name)
                            .ThenBy(e => e.AddressText)
                            .Take(10)
                            .Select(e =>
                                new
                                {
                                    e.AddressText,
                                    e.Town.Name,
                                    e.Employees.Count
                                })
                            .ToList();
            return string.Join(Environment.NewLine, addresses.Select(a => $"{a.AddressText}, {a.Name} - {a.Count} employees"));
        }
        public static string GetEmployee147(SoftUniContext context)
        {
            var ep = context.EmployeesProjects.Where(p => p.EmployeeId == 147).Select(p => p.ProjectId).ToList();
            var projects = context.Projects.Where(p => ep.Contains(p.ProjectId)).Select(p => p.Name).OrderBy(p => p).ToList();
            Employee? empl147 = context.Employees.FirstOrDefault(e => e.EmployeeId == 147);
            return
                $"{empl147.FirstName} {empl147.LastName} - {empl147.JobTitle}" +
                $"{(projects.Count > 0 ? Environment.NewLine + string.Join(Environment.NewLine, projects) : "")}";
        }
        public static string GetDepartmentsWithMoreThan5Employees(SoftUniContext context)
        {
            var deps = context.Departments
                        .Where(d => d.Employees.Count > 5)
                        .OrderBy(d => d.Employees.Count)
                        .ThenBy(d => d.Name)
                        .Select(d =>
                        new
                        {
                            Title = $"{d.Name} - {d.Manager.FirstName} {d.Manager.LastName}",
                            Employees = d.Employees
                                        .OrderBy(e => e.FirstName)
                                        .ThenBy(e => e.LastName)
                                        .Select(e => $"{e.FirstName} {e.LastName} - {e.JobTitle}"),
                        })
                        .Select(d => $"{d.Title}{(d.Employees.Count() > 0 ? Environment.NewLine + string.Join(Environment.NewLine, d.Employees) : "")}");
            return string.Join(Environment.NewLine, deps);
        }
    }
}