/*Question 40: Write a Java program to print all automorphic numbers between 1 and n.
 An automorphic number’s square ends with the number itself (e.g., 5² = 25).
Explanation:
Use loop to check square and a while loop to match last digits.
Input:

n = 100

Output:

1 5 6 25 76

Explanation:

Example:
5² = 25 ? ends with 5
25² = 625 ? ends with 25
Such numbers are called Automorphic Numbers.

Asked In Companies:*/

import java.util.*;
public class AutomorphicNo{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter number");
	int n=in.nextInt();
	int square;
	
	
	for(int i=1;i<=n;i++){
		square=i*i;
		int temp = i;
		int sq = square;

		while(temp > 0){
			if(temp % 10 != sq % 10){
				break;
			}
			temp = temp / 10;
			sq = sq / 10;
			}
			if(temp == 0){
				System.out.println(i);
			}
		}
	}
}