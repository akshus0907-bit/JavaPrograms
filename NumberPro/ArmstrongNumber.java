
import java.util.Scanner;

class ArmstrongNumber
{
    // Count digits using recursion
    static int countDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }

    // Calculate power using recursion
    static int power(int base, int exp)
    {
        if (exp == 0)
        {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    // Calculate Armstrong sum using recursion
    static int armstrongSum(int n, int digits)
    {
        if (n == 0)
        {
            return 0;
        }

        int digit = n % 10;

        return power(digit, digits)
               + armstrongSum(n / 10, digits);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0)
        {
            System.out.println("Enter a non-negative number");
        }
        else
        {
            int digits = (n == 0) ? 1 : countDigits(n);
            int sum = armstrongSum(n, digits);

            if (sum == n)
            {
                System.out.println("Armstrong Number");
            }
            else
            {
                System.out.println("Not an Armstrong Number");
            }
        }

        sc.close();
    }
}
