//anagrm string
import java.util.Scanner;
import java.util.Arrays;

public class AnagramString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine().toLowerCase();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length() != s2.length())
        {
            System.out.println("Not Anagram");
        }
        else
        {
            char a[] = s1.toCharArray();
            char b[] = s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}
