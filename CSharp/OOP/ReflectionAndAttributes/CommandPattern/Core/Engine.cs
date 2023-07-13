using CommandPattern.Core.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandPattern.Core
{
    internal class Engine : IEngine
    {
        ICommandInterpreter _commandInterpreter;
        public Engine(ICommandInterpreter commandInterpreter)
        {
            _commandInterpreter = commandInterpreter;
        }
        public void Run()
        {
            while (true)
            {
                string args = Console.ReadLine();
                try
                {
                    string result = _commandInterpreter.Read(args);
                    Console.WriteLine(result);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }
    }
}