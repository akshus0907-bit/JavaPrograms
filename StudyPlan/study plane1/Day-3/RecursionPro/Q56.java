/*56 Recursive palindrome check LC 125*/

import java.util.*;
public class Q56{
		static int rev=0;
	public static void main(String[]args){
	
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int original =n;
		palindrome(n);
		if(original==rev){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
	static void palindrome(int n){
		if(n==0){
			return ;
		}
		
		int r=n%10;
		rev=(rev*10)+r;
		palindrome(n/10);
		
		
	}
}
		