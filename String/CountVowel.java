/*Count Vowels Take a String and count:
a
e
i
o
u

Example:
Input:
education
Output:
Vowels = 5*/

import java.util.*;
public class CountVowel{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
		System.out.println(count);
	}
}