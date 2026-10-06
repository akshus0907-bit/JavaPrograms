/*Take String Input
Take a string from the user using Scanner and display it.*/

import java.util.*;
public class DisplayStr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=in.nextLine();
		
		System.out.println(str);
	}
}