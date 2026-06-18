/*Question 19: Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.
Input:
Array = [5, -3, 7, -1, 0, -6, 4]

Output:
Updated Array = [5, 0, 7, 0, 0, 0, 4]

Explanation:
Traverse the array and check each element; if the element is negative replace it with 0, 
otherwise keep it unchanged, then print the modified array.*/
import java.util.*;
public class ReplaceNegative{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int size=in.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				a[i]=0;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
	
		

