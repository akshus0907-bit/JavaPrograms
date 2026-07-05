/*Q1. Write a java program to check Number Is happy Number or Not happy using function recursion. */

import java.util.Scanner;

public class HappyNoQ1 {

    static int sum(int n) {
        if (n == 0)
            return 0;

        int d = n % 10;
        return d * d + sum(n / 10);
    }

    static boolean happy(int n) {
        if (n == 1)
            return true;

        if (n == 4)
            return false;

        return happy(sum(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (happy(n))
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");

        sc.close();
    }
}