namespace Exam_TempleOfDoom
{
    internal class TempleOfDoom : IRun
    {
        private List<int> _challenges;
        private List<int> _tools;
        private List<int> _substances;
        public void Run()
        {
            _tools = Console.ReadLine()
                              .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                              .Select(int.Parse)
                              .ToList();
            _substances = Console.ReadLine()
                                  .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                  .Select(int.Parse)
                                  .ToList();
            _challenges = Console.ReadLine()
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                    .Select(int.Parse)
                                    .ToList();

            for (int i = 0; i < _tools.Count; i++)
            {
                if (_substances.Count <= 0 || _challenges.Count <= 0)
                {
                    break;
                }
                int j = _substances.Count - 1;
                int result = _tools[i] * _substances[j];
                if (CheckAnyChalengeEqual(result))
                {
                    _tools.RemoveAt(i);
                    i--;
                    _substances.RemoveAt(j);
                }
                else
                {
                    int tool = _tools[i] + 1;
                    _tools.RemoveAt(i);
                    i--;
                    _tools.Add(tool);

                    _substances[j]--;
                    if (_substances[j] <= 0)
                    {
                        _substances.RemoveAt(j);
                    }
                }
            }
            PrintResult();
        }

        private bool CheckAnyChalengeEqual(int result)
        {
            for (int c = 0; c < _challenges.Count; c++)
            {
                if (_challenges[c] == result)
                {
                    _challenges.RemoveAt(c);
                    return true;
                }
            }
            return false;
        }
        private void PrintResult()
        {

            if ((_tools.Count <= 0 || _substances.Count <= 0) && _challenges.Count > 0)
            {
                Console.WriteLine("Harry is lost in the temple. Oblivion awaits him.");
            }
            else if (_challenges.Count <= 0)
            {
                Console.WriteLine("Harry found an ostracon, which is dated to the 6th century BCE.");
            }
            if (_tools.Count > 0)
            {
                Console.WriteLine($"Tools: {string.Join(", ", _tools)}");
            }
            if (_substances.Count > 0)
            {
                Console.WriteLine($"Substances: {string.Join(", ", _substances)}");
            }
            if (_challenges.Count > 0)
            {
                Console.WriteLine($"Challenges: {string.Join(", ", _challenges)}");
            }
        }
    }
}