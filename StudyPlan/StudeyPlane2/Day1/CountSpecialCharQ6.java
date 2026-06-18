/*6. Count the number of special characters in a string.*/

import java.util.*;
public class CountSpecialCharQ6{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
				if(!(ch>='a' &&ch<='z')||
				(ch>='0' && ch<='9')||
				(ch>='a' && ch<='Z')){
					count++;
				}
		}
		System.out.println(count);
	}
}