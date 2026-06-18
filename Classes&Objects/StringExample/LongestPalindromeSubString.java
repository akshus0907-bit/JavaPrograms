/*33. Longest Palindrome Substring
Class Name: LongestPalindrome
Methods:
void setString(String str)
String getLongestPalindrome()
Example
Input:"babad"
Output:"bab"*/

import java.util.*;
public class LongestPalindromeSubString{
	private String Str;
	public void setString(String s){
		Str=s;
	}
	public String getLongestPalindrome(){
		  String longest = "";
		
		for(int i=0;i<Str.length();i++){
			for(int j=i;j<Str.length();j++){
				String sub = Str.substring(i, j + 1);
			
			String rev="";
			for(int a=sub.length()-1;a>=0;a--){
				rev=rev+sub.charAt(a);
			}
		 if (sub.equals(rev)) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
		}
        

        return longest;
    }
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		LongestPalindromeSubString  l=new LongestPalindromeSubString();
		System.out.println("enter string");
		String s=in.nextLine();
		l.setString(s);
		  System.out.println(l.getLongestPalindrome());
	}
}
	
		
