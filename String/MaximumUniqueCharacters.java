
import java.util.Scanner;

class MaximumUniqueCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0)
        {
            System.out.println("Invalid size");
            sc.close();
            return;
        }

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }

        String result = "";
        int maxUnique = 0;

        for (int i = 0; i < n; i++)
        {
            String str = arr[i];
            int unique = 0;

            for (int j = 0; j < str.length(); j++)
            {
                char ch = Character.toLowerCase(str.charAt(j));
                boolean found = false;

                for (int k = 0; k < j; k++)
                {
                    char previous =
                        Character.toLowerCase(str.charAt(k));

                    if (ch == previous)
                    {
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    unique++;
                }
            }

            if (unique > maxUnique)
            {
                maxUnique = unique;
                result = str;
            }
        }

        System.out.println("String = " + result);
        System.out.println("Unique Characters = " + maxUnique);

        sc.close();
    }
}
