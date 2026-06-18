/*93 Remove duplicate characters LC 1047*/

import java.util.*;
public class Q93{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		
		for(int i=0;i<ch.length-1;i++){
			boolean  visited=false;
			for(int j=0;j<i;j++){
				if(ch[i]==ch[j]){
					visited=true;
					break;
				}
			
			}
			if(visited){
				continue;
			}
			System.out.println(ch[i]);
		}
	}
}