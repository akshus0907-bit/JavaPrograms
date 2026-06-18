/*30. Remove all special characters from a string.*/
import java.util.*;
public class RemoveSpecialCharQ30{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String removeSpecialchar(){
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z')|| (ch>='0' &&ch<='9')){
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		RemoveSpecialCharQ30 r=new RemoveSpecialCharQ30();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.removeSpecialchar());
	}
}