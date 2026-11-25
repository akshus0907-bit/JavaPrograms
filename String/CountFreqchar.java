//count the frequence of each char

import java.util.*;
public class CountFreqchar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			int count=1;
			
			for(int j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]='*';
				}
			}
			System.out.println(ch[i]+" \t"+count);
			
		}
	}
}