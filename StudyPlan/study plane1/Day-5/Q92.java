/*92 Count special characters LC 3120 */

import java.util.*;
public class Q92{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char [s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		int count =0;
		for(int i=0;i<ch.length;i++){
		if(!((ch[i]>='a' && ch[i]<='z')||
		 (ch[i]>='A' && ch[i]<='Z')||
		  (ch[i]>='0'&& ch[i]<='9')||
		  ch[i]==' '))
		  {
			  count++;
		  }
		}
		System.out.println(count);
		
	}
}