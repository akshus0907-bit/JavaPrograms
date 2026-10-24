
import java.util.HashMap;
import java.util.Scanner;

class PrimeWordLength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map =
            new HashMap<String, Integer>();

        System.out.print("Enter words: ");
        String input = sc.nextLine();

        String word = "";

        // Extract words without split()
        for (int i = 0; i <= input.length(); i++)
        {
            if (i < input.length() && input.charAt(i) != ' ')
            {
                word = word + input.charAt(i);
            }
            else if (word.length() > 0)
            {
                map.put(word, word.length());
                word = "";
            }
        }

        System.out.println("Words with Prime Length:");

        for (String key : map.keySet())
        {
            int len = map.get(key);
            boolean prime = len > 1;

            for (int i = 2; i * i <= len; i++)
            {
                if (len % i == 0)
                {
                    prime = false;
                    break;
                }
            }

            if (prime)
            {
                System.out.println(key + "-" + len);
            }
        }

        sc.close();
    }
}
