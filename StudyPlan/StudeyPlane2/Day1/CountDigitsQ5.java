/*5. Count the number of digits in a string.*/

import java.util.*;
public class CountDigitsQ5{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>'0' && ch<'9'){
				count++;
			}
		}
		System.out.println(count);
	}
}