/*9. Check if Two String Arrays are Equivalent (LC 1662 Inspired)
Given two strings, compare them character by character and determine whether they are
equal. Return true if both strings are identical; otherwise, return false.
Example: Input: "abc", "abc" → Output: true*/

import java.util.*;
public class Q9{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of first string");
		int  s=in.nextInt();
		in.nextLine();
		String word1[]=new String[s];
		System.out.println("enter first string");
		for(int i=0;i<word1.length;i++){
			word1[i]=in.nextLine();
		}
		System.out.println("enter size of second string");
		int  c=in.nextInt();
		in.nextLine();
		String word2[]=new String[c];
		System.out.println("enter second string");
		for(int i=0;i<word2.length;i++){
			word2[i]=in.nextLine();
		}
		
		String s1="";
		String s2="";
		for(int i=0;i<word1.length;i++){
			s1=s1+word1[i];
		}
		for(int i=0;i<word2.length;i++){
			s2=s2+word2[i];
		}
		if(s1.equals(s2)){
		System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
		
		/*System.out.println("enter first string");
		String s=in.nextLine();
		
		System.out.println("enter second string");
		String a=in.nextLine();
		boolean equal=true;
		if(s.length()!=a.length()){
			equal=false;
		}
		else{
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!=a.charAt(i)){
					equal=false;
					break;
				}
			}
		}
		System.out.println(equal);
	}
}*/
		