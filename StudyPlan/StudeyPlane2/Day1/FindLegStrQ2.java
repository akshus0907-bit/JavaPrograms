/*2. Find the length of a string without using `length()`.*/
import java.util.*;
public class FindLegStrQ2{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char arr[]=s.toCharArray();

		int length=0;
		for(int i=0;i<arr.length;i++){
			length++;
		}
		System.out.println(length);
	}
}
			
			