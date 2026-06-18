/*23. Check whether a string contains only digits.*/
import java.util.*;
public class CheckStrDigitQ23{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public boolean checkStr(){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<='0' ||ch>='9'){
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CheckStrDigitQ23 c=new CheckStrDigitQ23();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.checkStr());
	}
}