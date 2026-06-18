/*7. Number of Segments in a String (LC 434)
Given a sentence, count the total number of words or segments separated by spaces.
Consecutive spaces should not be counted as extra words.
Example: Input: "I love programming" → Output: 3*/

import java.util.*;
public class Q7{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		int count =0;
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
			if(ch[i] != ' ' && (i == 0 || ch[i-1] == ' ')){
				count++;
			}
		}
		System.out.println(count);
	}
}
		
