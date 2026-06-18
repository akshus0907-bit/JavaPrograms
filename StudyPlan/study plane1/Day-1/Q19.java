/*19. Find the Index of the First Occurrence in a String (LC 28)
Given two strings, determine whether the second string exists as a substring inside the first
string. Return the index or indicate if it is not found.
Example: Input: "hello world", "world" → Output: Found*/

import java.util.*;
public class Q19{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=in.nextLine();
		char ch[]=new char[s1.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s1.charAt(i);
		}
		System.out.println("enter second string");
		String s2=in.nextLine();
		
		char ch1[]=new char[s2.length()];
		for(int i=0;i<ch1.length;i++){
			ch1[i]=s2.charAt(i);
		}
		boolean found=false;
		for(int i=0;i<=ch.length-ch1.length;i++){
			int j;
			for(j=0;j<ch1.length;j++){
			if(ch[i+j]!=ch1[j]){
				break;
			}
		}
		
		if(j==ch1.length){
			System.out.println("found, at index"+i);
			found=true;
			break;
		}
	}
	if(!found){
			System.out.println("not found");
		}
	
	}
}