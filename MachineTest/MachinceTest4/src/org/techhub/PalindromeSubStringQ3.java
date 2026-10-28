
package org.techhub;

public class PalindromeSubStringQ3 {
	
	public static void main(String[]args) {
		
		String str="forgeeksskeegfor ";             // given string 
		String longest="";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				boolean palindrome=true;                  //flag to check the string is palindrome or not 
				int left=i;                             //travel from left to right 
				int right=j;
				while(left<right) {
					if(str.charAt(left)!=str.charAt(right)) {                    //compare string charcater
						palindrome=false;
					break;
					}
					left++;
					right--;
				}
			if(palindrome && j-i+1>longest.length()) {
					longest=str.substring(i,j+1);
					
				}
			}
		}
		System.out.println(longest);                                 //print the longest palindrome strin from give string 
		}
		
		
		
	}









