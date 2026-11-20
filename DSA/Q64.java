/*Question 64: Find Maximum in Array
Description:
Find the largest element in an array.
Input:
[3,8,2,9,1]

Output:
Max = 9

Explanation:
Each element compared once.

Time Complexity: O(n)*/
import java.util.*;
public class Q64{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
			