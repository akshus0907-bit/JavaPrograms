/*44. Find the maximum occurring character.*/

import java.util.*;
public class MaxOccursQ44{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string ");
		String s=in.nextLine();
		int maxCount=0;
		char maxChar=s.charAt(0);
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
			}
			}
			if(count>maxCount){
				maxCount=count;
				maxChar=s.charAt(i);
			}
		}
		System.out.println("char ="+maxChar +" \n="+maxCount);
	}
}