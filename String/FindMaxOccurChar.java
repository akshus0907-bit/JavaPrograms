//Find the Maximum Occurring Character in a String

import java.util.*;
public class FindMaxOccurChar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		
		
		String s=in.nextLine();
		int max=0;
		char maxChar=' ';
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count ++;
				}
			}
			if(count>max){
				max=count;
				maxChar=s.charAt(i);
			}
		}
		System.out.println(maxChar+"\t"+max);
	}
}