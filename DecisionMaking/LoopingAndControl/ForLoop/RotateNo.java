/*Question 48: Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.

Example: n = 123456, k = 2 ? output 345612.
Hint: Use modulus and division to split and rearrange digits.
Input:

n = 123456
k = 2

Output:

345612

Explanation:

The first 2 digits are moved to the end of the number.*/

import java.util.*;
public class RotateNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		System.out.println("enter k");
		int k=in.nextInt();
		int temp=n;
		int count=0;
		
		while(temp>0){
			count++;
			temp=temp/10;
		}
		  k=k%count;
		int pow = 1;
			for(int i = 1; i <= (count - k); i++){
				pow = pow * 10;
			}
			
			int first=n/pow;
			int second=n%pow;
			
			int pow2 = 1;
				for(int i = 1; i <= k; i++){
				pow2 = pow2 * 10;
				}
				
			int result = (second * pow2) + first;
			System.out.println(result);
	}
}
