/*1.1. Count Total Vowels
Problem Statement
Create class name as CountVowel with two methods:
void setString(String str)
int getVowelCount()
Method Description
void setString(String str)
This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()
This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example
Input: "Education"
Output: 5
Explanation
The vowels are:
 E, u, a, i, o
Total vowels = 5
*/

import java.util.*;
public class CountVowels{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getVowelCount(){
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count++;
			}
			
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountVowels c=new CountVowels();
		System.out.println("enter String");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("total vowels="+c.getVowelCount());
	}
}