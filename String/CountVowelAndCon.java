//Count vowels and consonants

import java.util.*;
public class CountVowelAndCon{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=in.nextLine();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++){
			
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			vowels++;
		}
		else{
			consonants++;
		}
	}
	
	System.out.println("vowels count="+vowels);
	System.out.println("consonants count="+consonants);
}
}