
internal class FastFood : IRun
{
    public void Run()
    {
        int quantity = int.Parse(Console.ReadLine());
        Queue<int> orders = new(Console.ReadLine()
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                    .Select(int.Parse));
        Console.WriteLine(orders.Max());

        while (orders.Count > 0)
        {
            quantity -= orders.Peek();
            if (quantity < 0)
            {
                break;
            }
            orders.Dequeue();
        }

        if (orders.Count > 0)
        {
            Console.WriteLine("Orders left: " + string.Join(" ", orders));
        }
        else
        {
            Console.WriteLine("Orders complete");
        }
    }
}