/*2. Take start and end values and print all prime numbers in the range. Also print the total number of
primes and their sum.*/

import java.util.*;
public class PrimeNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter start");
		int start=in.nextInt();
		
		System.out.println("enter end");
		int end=in.nextInt();
		
		  int sum=0;
		  int count=0;
		  for(int i=start;i<=end;i++){
			  if(i<2){
				  prime=false;
			  }
			  
			    boolean prime=true;
			  for(int j=2;j<i;j++){
				  if(i%j==0){
					  
					  prime=false;
					  break;
					  
				  }
			  }
			 
		  
		  if(prime==true){
			  System.out.println(i);
			  count++;
			  sum=sum+i;
			  
	}
	}
	System.out.println(sum);
	System.out.println(count);
	}
}
					  
					  