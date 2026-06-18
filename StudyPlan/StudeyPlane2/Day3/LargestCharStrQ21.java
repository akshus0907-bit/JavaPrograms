/*21. Find the largest character in a string.*/
import java.util.*;
public class LargestCharStrQ21{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public char findlarget(){
		char largest=str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>largest){
				largest=str.charAt(i);
			}
		}
		return largest;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		LargestCharStrQ21 l=new LargestCharStrQ21();
		System.out.println("enter string");
		String s=in.nextLine();
		l.setString(s);
		System.out.println(l.findlarget());
	}
}