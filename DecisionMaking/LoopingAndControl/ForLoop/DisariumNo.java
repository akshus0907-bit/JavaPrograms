/*Question 43: Write a Java program to check whether a given number is a 
Disarium number or not, and display all Disarium numbers up to n.
A Disarium number is a number whose sum of its digits powered with 
their respective positions is equal to the number itself.

Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
Use a loop to count digits. Use another loop to extract each digit 
and calculate the digit raised to its position power using only loops 
(no Math.pow()). Check if the sum equals the original number.
Input:
Number = 135

Output:
Disarium Number

Explanation:
1¹ + 3² + 5³ = 1 + 9 + 125 = 135
Since the sum equals the number, it is Disarium.*/


import java.util.*;
public class DisariumNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		
		
		for(int i=1;i<=n;i++){            //for loop nako jar massage pahije asel tar
			int temp=i;           //temp=n
			int digit=0;
		    
		while(temp>0){
			digit++;
			temp=temp/10;
		}
		temp=i;                   //temp=n
		int pos=digit;
		int sum=0;
		while(temp>0){
			int r=temp%10;
			int power=1;
			for(int j=1;j<=pos;j++){
				power=power*r;
			}
			
			sum=sum+power;
			pos--;
			temp=temp/10;
		}
		if(sum==n){
			System.out.println(i);
		}
		
		}
	}
}