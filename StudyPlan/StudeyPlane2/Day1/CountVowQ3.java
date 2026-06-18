/*3. Count the number of vowels in a string.*/

import java.util.*;
public class CountVowQ3{
	public  static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a' ||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='u'){
				count++;
			}
		}
			System.out.println(count);
		}
	}

				
			