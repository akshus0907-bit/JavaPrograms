//reverse the each char in string 

import java.util.*;
public class ReverseEachChar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		
		int start=0;
		for(int i=0;i<=s.length();i++){
			if(i==s.length()|| s.charAt(i)==' '){
				for(int j=i-1;j>=start;j--){
					System.out.print(s.charAt(j));
				}
			
			System.out.println(" ");
			start=i+1;
			}
		}
	}
}