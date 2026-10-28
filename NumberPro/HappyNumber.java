/* Happy number   19->1 (square +9(square))= 82 then 8(sqt)+2(sqt)==68  then 6(sqt)+8(sqt)=100 then 1

import java.util.*;
public class HappyNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		
		int temp=n;
		
		while(temp!=1 && temp!=4){
			int sum=0;
			
			while(temp>0){
				int digit=temp%10;
				sum=sum+digit*digit;
				temp=temp/10;
			}
			temp=sum;
		}
		if(temp==1)
			System.out.println("happy number");
		
		else
			System.out.println("number is not happy number");
		
	}
}

