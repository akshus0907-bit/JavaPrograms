/*15. First Non-Repeating Character (LC 387)
Given a string, find and return the first character that appears only once in the string. If no such
character exists, return an appropriate value.
Example: Input: "swiss" → Output: "w"*/

import java.util.*;
public class Q15{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter staring");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++){
			int count=0;
			boolean visited=false;
			
			for(int k=0;k<i;k++){
				if(ch[k]==ch[i]){
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
		
		if(count==1){
			System.out.println(ch[i]);
			break;
		}
		}
	}
}
		
			