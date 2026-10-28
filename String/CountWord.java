//count word in string

import java.util.*;

public class CountWord{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter senetence");
		String s=in.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1)==' '))
			{
				count++;
			}
	}
	System.out.println("total words"+count);
}
}