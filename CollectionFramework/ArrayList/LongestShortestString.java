
import java.util.ArrayList;
import java.util.Scanner;

class LongestShortest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter string: ");
            list.add(sc.nextLine());
        }

        if (list.size() == 0)
        {
            System.out.println("List is empty");
            sc.close();
            return;
        }

        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++)
        {
            int len = list.get(i).length();

            if (len > maxLength)
            {
                maxLength = len;
            }

            if (len < minLength)
            {
                minLength = len;
            }
        }

        System.out.println("Longest Strings:");

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == maxLength)
            {
                System.out.println(list.get(i));
            }
        }

        System.out.println("Shortest Strings:");

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == minLength)
            {
                System.out.println(list.get(i));
            }
        }

        sc.close();
    }
}
