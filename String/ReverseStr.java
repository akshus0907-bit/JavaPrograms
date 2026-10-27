//reverse the string with using inbuild function


import java.util.*;
public class ReverseStr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter  string");
		String str=in.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
	}
}