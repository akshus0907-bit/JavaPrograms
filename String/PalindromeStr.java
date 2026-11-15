//string is palindrome

import java.util.*;
public class PalindromeStr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=in.nextInt();
		
		int i=0;
		int j=str.length()-1;
		boolean palindrome=true;
		
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)){
				palindrome=false;
				break;
			}
			i++;
			j--;
		}
		
		if(palindrome){
			System.out.println("palindrome string");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
}