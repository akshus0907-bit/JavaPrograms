/*16. Count Characters

Take a String from the user and count the number of characters.

Example:

Input:
Java

Output:
Number of characters = 4*/
import java.util.*;
class CountChar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=in.nextLine();
		
		int count3=str.length();
		System.out.println(count3);
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println(count);
	}
}
			