using SoftUni.Data;
using Microsoft.EntityFrameworkCore;
using SoftUni.Models;
using Microsoft.VisualBasic;
using Microsoft.EntityFrameworkCore.Infrastructure;
using System.Collections.Generic;
using System.Runtime.ConstrainedExecution;
using System.Collections.Immutable;
using Microsoft.Data.SqlClient.Server;
using System.Collections;
using System.ComponentModel;
using System.Linq;
using System.Net;
using System.Xml.Linq;
using System;

namespace SoftUni
{
    public class StartUp
    {
        public static void Main(string[] args)
        {
            SoftUniContext context = new();
            Console.WriteLine(RemoveTown(context));
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
        public static string GetLatestProjects(SoftUniContext context)
        {
            return string.Join(Environment.NewLine, context.Projects
                             .OrderByDescending(p => p.StartDate)
                             .Take(10)
                             .OrderBy(p => p.Name)
                             .Select(project =>
                             $"{project.Name}{Environment.NewLine}" +
                             $"{project.Description}{Environment.NewLine}" +
                             $"{project.StartDate:M/d/yyyy h:mm:ss} " +
                             $"{(project.StartDate.TimeOfDay.Hours > 12 ? "PM" : "AM")}"));
        }
        public static string IncreaseSalaries(SoftUniContext context)
        {
            var employeesPerDepartment = context.Departments
                                .Where(d =>
                                d.Name.Equals("Engineering") ||
                                d.Name.Equals("Tool Design") ||
                                d.Name.Equals("Marketing") ||
                                d.Name.Equals("Information Services"))
                                .Select(d => d.Employees.ToList())
                                .ToList();
            List<Employee> employeesList = new();
            employeesPerDepartment.ForEach(eL => eL.ForEach(e => employeesList.Add(e)));
            var employees = employeesList
                                .Distinct()
                                .OrderBy(e => e.FirstName)
                                .ThenBy(e => e.LastName)
                                .ToList();
            employees.ForEach(e => e.Salary *= (decimal)1.12);
            return string.Join(Environment.NewLine, employees.Select(e => $"{e.FirstName} {e.LastName} (${e.Salary:F2})"));

        }
        public static string GetEmployeesByFirstNameStartingWithSa(SoftUniContext context)
        {
            var employees = context.Employees
                                .Where(e => e.FirstName.StartsWith("Sa"))
                                .OrderBy(e => e.FirstName)
                                .ThenBy(e => e.LastName);

            return string.Join(Environment.NewLine, employees.Select(e => $"{e.FirstName} {e.LastName} - {e.JobTitle} - (${e.Salary:F2})"));
        }
        public static string DeleteProjectById(SoftUniContext context)
        {
            context.EmployeesProjects.RemoveRange(context.EmployeesProjects.Where(ep => ep.ProjectId == 2));
            context.Projects.Remove(context.Projects.FirstOrDefault(p => p.ProjectId == 2));
            return string.Join(Environment.NewLine, context.Projects.Select(p => p.Name));
        }
        public static string RemoveTown(SoftUniContext context)
        {
            var townToDelete = context.Towns.FirstOrDefault(t => t.Name == "Seattle");
            var addressesRange = context.Addresses.Where(a => a.Town.TownId == townToDelete.TownId);
            int deleteCount = addressesRange.Count();
            var empl = context.Employees.Where(e => addressesRange.Any(a => e.Address.AddressId == a.AddressId)).ToList();
            empl.ForEach(e =>
            {
                e.AddressId = null;
            });
            context.Addresses.RemoveRange(addressesRange);
            context.Remove(townToDelete);


            context.SaveChanges();

            return $"{deleteCount} addresses in Seattle were deleted";
        }
    }
}