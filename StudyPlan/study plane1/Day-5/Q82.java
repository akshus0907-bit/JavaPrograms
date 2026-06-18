/*82 Longest word in sentence LC 720*/

import java.util.*;
public class Q82{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		int count =0;
		int max=0;
		String CurrentWord="";
		String LongestWord="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				count++;
				CurrentWord=CurrentWord+ch[i];
			}
			else{
				if(count>max){
					max=count;
					LongestWord=CurrentWord;
				}
			
			count=0;;
			CurrentWord="";
		  }
		}
		if(count>max){
			max=count;
			LongestWord=CurrentWord;
		}
			System.out.println("longest word ="+LongestWord);
			System.out.println("length="+max);
	}
}	
			
			
		