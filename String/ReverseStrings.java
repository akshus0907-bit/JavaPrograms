
import java.util.ArrayList;
import java.util.Scanner;

class ReverseStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        int i = 0;

        while (i < n)
        {
            System.out.print("Enter string: ");
            list.add(sc.nextLine());
            i++;
        }

        i = 0;

        while (i < list.size())
        {
            String str = list.get(i);
            String reversed = "";

            int j = str.length() - 1;

            while (j >= 0)
            {
                reversed = reversed + str.charAt(j);
                j--;
            }

            list.set(i, reversed);
            i++;
        }

        System.out.println(list);

        sc.close();
    }
}
