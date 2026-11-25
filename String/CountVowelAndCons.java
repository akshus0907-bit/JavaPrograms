//Count Vowels and Consonants

import java.util.*;
public class CountVowelAndCons{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		
		int vowel=0;
		int con=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vowel++;
			}
			else{
				con++;
			}
		}
		System.out.println("vowels is="+ vowel+"\nconsonantes "+con);
	}
}