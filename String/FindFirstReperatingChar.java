//find first reperating char

import java.util.*;
public class FindFirstReperatingChar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		
		boolean flag=false;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					System.out.println("first  repaerating char="+s.charAt(j));
					flag=true;
					break;
				}
			}
		
		if(flag){
			break;
		}
		if(!flag){
			System.out.println("no repaerating char");
		}
		}
	}
}