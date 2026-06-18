/*2.  Count Total Consonants
Problem Statement
Create class CountConsonant with methods:
void setString(String str)
int getConsonantCount()
Method Description
void setString(String str)
Accepts string from user.
int getConsonantCount()
Counts all consonants and returns count.
Example
Input: "Computer"
Output: 6
Explanation
Consonants are:
 C, m, p, t, r
*/

import java.util.*;
public class CountConsonants{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getConsonantCount(){
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				System.out.println(ch);
				count++;
			}
		}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountConsonants c=new CountConsonants();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("total consonants="+c.getConsonantCount());
	}
}
