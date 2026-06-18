/*Question 42: Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
For example:
? 9² = 81 ? split as 8 and 1 ? 8 + 1 = 9
? 45² = 2025 ? split as 20 and 25 ? 20 + 25 = 45
Input:

Number = 45

Output:

Kaprekar Number

Explanation:

45² = 2025
Split as 20 and 25
20 + 25 = 45
So it is a Kaprekar number.

Input:

n = 50

Output:

1 9 45

Explanation:

These numbers satisfy the Kaprekar condition up to 50.*/

import java.util.*;
public class KaprekarNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
		int sum = 0;
		int digits=0;
		int temp=i;
        
		
// digits count
			while(temp > 0){
				digits++;
				temp = temp / 10;
			}

			int square = i * i;

			// power correct keli
			int power = (int)Math.pow(10, digits);

			// split correct
			int right = square % power;
			int left = square / power;

			// sum direct
			sum = left + right;

			// check
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
        
 
