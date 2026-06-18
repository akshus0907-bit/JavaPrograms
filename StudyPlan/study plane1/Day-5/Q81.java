/*81 String compression LC 443*/

import java.util.*;
public class Q81{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		int count=1;
		String ans="";
		for(int i=0;i<ch.length;i++){
			while(i<ch.length-1 && ch[i]==ch[i+1]){
				count++;
				i++;
			}
			ans=ans+ch[i];
			if(count>1){
				ans=ans+count;
			
			}
			count=1;
		}
			System.out.println(ans);
	}
}