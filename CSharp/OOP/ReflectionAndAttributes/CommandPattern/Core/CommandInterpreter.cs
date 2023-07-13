using CommandPattern.Core.Contracts;
using System;
using System.Linq;
using System.Reflection;

namespace CommandPattern.Core
{
    public class CommandInterpreter : ICommandInterpreter
    {
        public string Read(string args)
        {
            string[] param = args.Split(" ", StringSplitOptions.RemoveEmptyEntries);
            Type commandType = Assembly
                .GetEntryAssembly()
                .GetTypes()
                .FirstOrDefault(t => t.Name == $"{param[0]}Command");
            if (commandType == null)
            {
                throw new InvalidOperationException("Command not found");
            }

            ICommand command = (ICommand)Activator.CreateInstance(commandType);

            return command.Execute(param.Skip(1).ToArray());
        }
    }
}
