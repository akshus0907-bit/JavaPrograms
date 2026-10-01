/*5. Take a number and calculate the factorial of each digit. Find their total sum and check whether the
number is a Strong number.*/

import java.util.*;
public class StrongNum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		
		while(n>0){
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++){
				fact=fact*i;
			}
			
			n=n/10;
			sum=sum+fact;
		}
		
		if(sum==temp){
			System.out.println("strong number");
		}
		else{
			System.out.println("not strong");
		}
	}
}
				
				