/*26. Check whether a string contains only lowercase letters.*/
import java.util.*;
public class CheckStrLowerQ26{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public boolean checkLower(){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<'a' || ch>'z'){
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CheckStrLowerQ26 c=new CheckStrLowerQ26();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.checkLower());
	}
}