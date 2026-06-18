/*33. Toggle the case of each character.*/
import java.util.*;
public class ToggleQ33{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String toggle(){
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z'){
				ch=(char)(ch-32);
				result=result+ch;
			}
			else if(ch>='A' && ch<='Z'){
				ch=(char)(ch+32);
				result=result+ch;
			}
			else{
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ToggleQ33 t=new ToggleQ33();
		System.out.println("enter string");
		String s=in.nextLine();
		t.setString(s);
		System.out.println(t.toggle());
	}
}
			