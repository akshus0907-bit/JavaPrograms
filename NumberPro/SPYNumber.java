/*Question: Write a Java program to check whether a number is a Spy number.

Meaning: The sum of the digits must equal the product of the digits.

Example: 1124
- Sum = \(1+1+2+4=8\)
- Product = \(1\times1\times2\times4=8\)*/


import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int product = 1;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        if(n >= 0 && sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
