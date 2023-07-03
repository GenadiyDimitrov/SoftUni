namespace Telephony
{
    public interface IBrowser
    {
        public string Address { get; set; }
        public void Browse();
    }
    public abstract class Phone
    {
        public string PhoneNumber
        {
            get => _phoneNumber;
            set
            {
                if (value.All(char.IsDigit) && (value.Length == 7 || value.Length == 10))
                {
                    _phoneNumber = value;
                }
                else
                {
                    Console.WriteLine("Invalid number!");
                }
            }
        }
        public string _phoneNumber = "";
        public void Call()
        {
            Console.WriteLine($"{(_phoneNumber.Length == 7 ? "Dialing" : "Calling")}... {PhoneNumber}");
        }
    }
    public class Smartphone : Phone, IBrowser
    {
        public string Address
        {
            get => _address;
            set
            {
                if (value.Any(char.IsDigit))
                {
                    throw new ArgumentException("Invalid URL!");
                }
                else
                {
                    _address = value;
                }
            }
        }
        public string _address = "";

        public void Browse()
        {
            Console.WriteLine($"Browsing: {Address}!");
        }
    }
    public class StationaryPhone : Phone
    {
    }
    public class Program
    {
        static void Main(string[] args)
        {
            string[] numbers = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            foreach (var number in numbers)
            {
                if (number.All(char.IsDigit) && (number.Length == 7 || number.Length == 10))
                {

                    if (number.Length == 7)
                    {
                        Console.WriteLine($"Dialing... {number}");
                    }
                    else
                    {
                        Console.WriteLine($"Calling... {number}");
                    }
                }
                else
                {
                    Console.WriteLine("Invalid number!");
                }

            }
            string[] sites = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            foreach (var site in sites)
            {
                if (!site.Any(char.IsDigit))
                {
                    Console.WriteLine($"Browsing: {site}!");
                }
                else
                {
                    Console.WriteLine("Invalid URL!");
                }

            }
        }
    }
}