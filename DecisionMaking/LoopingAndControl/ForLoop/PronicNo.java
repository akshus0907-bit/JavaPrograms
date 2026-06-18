/*Question 45: Write a Java program to print all Pronic numbers between 1 and n.
A Pronic number is the product of two consecutive integers, i.e., n(n+1).
Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).
  check: i == j*(j+1)
  ✔️ yes → print i
  👉 break
Input:

n = 20

Output:            

2 6 12 20

Explanation:

Pronic numbers are of the form n(n+1).
Example: 3×4 = 12.*/

import java.util.*;
public class PronicNo{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(i-1);j++){
				if(i==j*(j+1)){
					System.out.println(i);
				break;
				}
			}
		}
	}
}