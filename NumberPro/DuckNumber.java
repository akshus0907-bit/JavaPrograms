
/*Question: Write a Java program to check whether a number is a Duck number.

Meaning: A Duck number contains at least one zero, but its first digit must not be zero. Here, input is treated as a positive integer, so leading zeros are not preserved.

Example: 1023 is a Duck number.*/
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        String n = sc.next();

        boolean found = false;

        if(n.charAt(0) != '0')
        {
            int i = 1;

            while(i < n.length())
            {
                if(n.charAt(i) == '0')
                    found = true;

                i++;
            }
        }

        if(found)
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
