/*Question 25: Write a java program to find the total number of notes in a given amount.
Input:
Amount = 2528

Output
500 = 5
100 = 0
50 = 0
20 = 1
10 = 0
5 = 1
2 = 1
1 = 1

Explanation:
The amount is divided starting from the highest denomination to the lowest to calculate the number of notes.*/

import java.util.*;
public class Note{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int amount=in.nextInt();
		int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;

        // 500 च्या नोटा
        if (amount >= 500) {
            n500 = amount / 500;
            amount = amount % 500;
        }
        
        // 100 च्या नोटा
        if (amount >= 100) {
            n100 = amount / 100;
            amount = amount % 100;
        }

        // 50 च्या नोटा
        if (amount >= 50) {
            n50 = amount / 50;
            amount = amount % 50;
        }

        // 20 च्या नोटा
        if (amount >= 20) {
            n20 = amount / 20;
            amount = amount % 20;
        }

        // 10 च्या नोटा
        if (amount >= 10) {
            n10 = amount / 10;
            amount = amount % 10;
        }

        // 5 च्या नोटा
        if (amount >= 5) {
            n5 = amount / 5;
            amount = amount % 5;
        }

        // 2 च्या नोटा
        if (amount >= 2) {
            n2 = amount / 2;
            amount = amount % 2;
        }

        // 1 च्या नोटा
        if (amount >= 1) {
            n1 = amount;
        }

        
        System.out.println("500 = " + n500);
        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("20 = " + n20);
        System.out.println("10 = " + n10);
        System.out.println("5 = " + n5);
        System.out.println("2 = " + n2);
        System.out.println("1 = " + n1);
        
        
    }
}


