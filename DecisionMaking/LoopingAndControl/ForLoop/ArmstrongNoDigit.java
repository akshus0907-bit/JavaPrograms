/*Question 33: Write a java program to display 1 to nth Armstrong Number
Input:

n = 4

Output:

0 1 153 370

Explanation:

0 and 1 are Armstrong Numbers.
153 and 370 are Armstrong Numbers because the sum of cubes of their digits equals the num*/
import java.util.*;
public class ArmstrongNoDigit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter  number");
		int n=in.nextInt();
		int count=0;
		int num=0;
		while(count<n){
			int sum=0;
			
			for(int temp=num;temp>0;temp=temp/10){
				int rem=temp%10;
				sum=sum+(rem*rem*rem);
			}
			if(sum==num){
				System.out.println(num+ "");
				count++;
			}
			num++;
		}
	}
}
	
	