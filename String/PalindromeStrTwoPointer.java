//palindrome string using two pointer

import java.util.*;
public class PalindromeStrTwoPointer{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		boolean flag=true;
		int start=0;
		int end=s.length()-1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				flag=false;
				break;
			}
				start++;
				end--;
		}
		if(flag){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
}