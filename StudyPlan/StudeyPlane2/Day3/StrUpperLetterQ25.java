/*25. Check whether a string contains only uppercase letters.*/
import java.util.*;
public class StrUpperLetterQ25{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public boolean findStrUpper(){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<'A' || ch>'Z'){
				return false;
		}
		}
		return true;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		StrUpperLetterQ25 u=new StrUpperLetterQ25();
		System.out.println("enter string");
		String s=in.nextLine();
		u.setString(s);
		System.out.println(u.findStrUpper());
	}
}
		
	