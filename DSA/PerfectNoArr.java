/*Question 38: Count the number of Perfect numbers in an array.
Input:
Array = [6, 28, 10, 12, 496]

Output:
Count of Perfect Numbers = 3

Explanation:
For each element calculate the sum of its divisors and if the sum equals the number then it is a perfect number.

Asked In Companies:
Practice assignment*/

import java.util.*;
public class PerfectNoArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++){
			
		    int sum=0;
			for(int j=1;j<a[i];j++){
				if(a[i]%j==0){
					sum=sum+j;
				}
			}
			if(sum==a[i] &&a[i]>0){
				count++;
			}
		}
		
		System.out.println("count of perfect number="+count);
		}
}
				