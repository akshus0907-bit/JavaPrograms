/*10. Check whether a string is a palindrome.*/
import java.util.*;
public class CheckStrPalindromeQ10{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter String");
		String s=in.nextLine();
		
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				flag=false;
				break;
			}
		
		i++;
		j--;
		}
		if(flag){
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}
		
		

