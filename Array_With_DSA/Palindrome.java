/*Question 33: Check whether the given array is a palindrome.
Input:
Array = [1, 2, 3, 2, 1]

Output:
true

Explanation:
Compare the first element with the last, the second with the second-last 
and continue until the middle; if all pairs match the array is a palindrome.*/

import java.util.*;
public class Palindrome{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		boolean flag=true;
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length/2;i++){
			if(a[i]!=a[a.length-1-i]){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}