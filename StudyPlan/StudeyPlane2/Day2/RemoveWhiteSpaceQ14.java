/*14. Remove all white spaces from a string.*/
import java.util.*;
public class RemoveWhiteSpaceQ14{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String removeWhiteSpace(){
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				result=result+str.charAt(i);
			}
		} 
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		RemoveWhiteSpaceQ14 r=new RemoveWhiteSpaceQ14();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.removeWhiteSpace());
	}
}
		