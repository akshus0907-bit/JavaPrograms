/*13. Print Duplicate Characters (No LeetCode)
Given a string, identify and print all characters that occur more than once in the string. Each
duplicate character should be printed only once.
Example: Input: "programming" → Output: "r g m"*/

import java.util.*;
public class Q13{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		
		
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++){
			int count =0;
			boolean visited=false;
			for(int k=0;k<i;k++){
				if(ch[i]==ch[k]){
					visited=true;
					break;
				}
			}
			if(visited){
				continue;
			}
			for(int j=0;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
				}
			}
			if(count>1){
			System.out.println(ch[i]);
		}
	}
}
}
		
		
		