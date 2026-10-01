/*7. Take start and end values and print all numbers that are divisible by 3 but not by 5. Also print their
count and sum.*/

import java.util.*;
public class PrintCountSum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("enter start");
		int start=in.nextInt();
		
		System.out.println("enter end");
		int end=in.nextInt();
		
		
		int count=0;
		int sum=0;
		
		
		for(int i=start;i<=end;i++){
			if(i%3==0 && i%5!=0){
				
				System.out.println(i);
				count++;
				sum=sum+i;
				
			}
		}
			System.out.println("count :"+count+ "\nsum:"+ sum);
			
		}
	}

			