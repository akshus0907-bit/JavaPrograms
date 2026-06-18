/*Question 32: Write a java program to display 1 to nth Strong Number.
Input:

n = 3

Output:

1 2 145

Explanation:

1 and 2 are Strong Numbers because 1! = 1 and 2! = 2.
145 is also a Strong Number because 1! + 4! + 5! = 145.*/
import java.util.*;
public class StrongNoDigit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=0;
		int num=1;
		while(count<n){
			int sum=0;
		
		
			for(int temp=num;temp>0;temp=temp/10){
				int rem=temp%10;
				int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			}
			if(sum==num){
				System.out.println(num+" ");
				
				count++;
			}
			num++;
		}
	}
}