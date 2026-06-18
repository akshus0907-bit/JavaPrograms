/*3. Count Vowels and Consonants (No LeetCode)
Given a string, count the total number of vowels and consonants present in it. Consider only
alphabetic characters while performing the count.
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3*/

import java.util.*;
public class Q3{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		int count1=0;
		int count2=0;
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
			
			if(ch[i]>='A' && ch[i]<='Z'){
				ch[i]=(char) (ch[i]+32);
			}
			if(!(ch[i]>='a' && ch[i]<='z')){
				continue;
			}
			
			if(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				count1++;
				
			}
			
			else{
				count2++;
				
			}
			
		}
		System.out.println("vowels="+count1);
		System.out.println("consonants="+count2);
	}
}
		
			
			