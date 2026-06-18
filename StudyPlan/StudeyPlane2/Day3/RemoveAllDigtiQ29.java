/*29. Remove all digits from a string.*/
import java.util.*;
public class RemoveAllDigtiQ29{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String removeDigit(){
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<'0' || ch>'9'){
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		RemoveAllDigtiQ29 r=new RemoveAllDigtiQ29();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.removeDigit());
	}
}