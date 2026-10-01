/*8. Take a number and find all its factors. Count the factors and use the count to determine whether
the number is prime or not.*/

import java.util.*;
public class NumFac{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		int fact;
		int count=0;
		
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				
			count++;
			}
		}
		System.out.println("count"+count);
		if(count%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
		}
}
