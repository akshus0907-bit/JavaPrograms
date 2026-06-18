/*4. Check Palindrome String
Problem Statement
Create class PalindromeCheck with methods:
void setString(String str)
boolean isPalindrome()
Method Description
void setString(String str)
Accepts string input.
boolean isPalindrome()
Checks whether string is palindrome or not and returns true or false.
Example
Input: "madam"
Output: true
Explanation
Original and reverse strings are same.
*/

import java.util.*;
public class CheckPalindrome{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String  isPalindrome(){
		String original=Str;
		String rev="";
		
			
		for(int i=Str.length()-1;i>=0;i--){
			char ch=Str.charAt(i);
			rev=rev+ch;
		}

		System.out.println("original="+original);
		System.out.println("reverse="+rev);
		if(original.length()!=rev.length()){
			return "not palindrome";
		}
		if(rev.equals(original)){
			return "palindrome";
		}
		else{
			return "Not palindrome";
		}
	
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		CheckPalindrome c=new CheckPalindrome();
		System.out.println("enter String");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.isPalindrome());
	}
}
		
			
		