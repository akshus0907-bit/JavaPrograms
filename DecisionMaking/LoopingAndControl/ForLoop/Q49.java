/*Question 49: Task: For a number n, calculate:
? Sum of digits at even places (from right)
? Sum of digits at odd places (from right)
? Finally print the difference of these sums.
Example: n = 572631 ? even places sum = 7+6+1 = 14, odd places sum = 5+2+3 = 10 ? difference = 4.
Hint: Use a loop with position tracking.
Input:

n = 572631

Output:

Difference = 4

Explanation:

Even places sum = 7 + 6 + 1 = 14
Odd places sum = 5 + 2 + 3 = 10
Difference = 4.*/

import java.util.*;
public class Q49{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
			System.out.println("enter number");
			int n=in.nextInt();
			int pos=1;
			int evenSum=0;
			int oddsum=0;
			while(n>0){
				int rem=n%10;
				if(pos%2==0){
					evenSum=evenSum+rem;
				}
				else{
					oddsum=oddsum+rem;
				}
				
				n=n/10;
				pos++;
			}
			
			int diff = Math.abs(evenSum - oddsum);
			System.out.println(diff);
			
	}
}