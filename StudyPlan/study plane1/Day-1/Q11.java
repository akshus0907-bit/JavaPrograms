/*11. First Unique Character / Character Frequency (LC 387 Inspired)
Given a string, count the frequency of each character and display how many times every
character appears in the string.
Example: Input: "banana" → Output: b=1, a=3, n=2*/

import java.util.*;
public class Q11{
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
			System.out.println(ch[i]+"="+count);
		}
	}
}
		
		
		