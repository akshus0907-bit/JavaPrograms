/*19. Toggle Case
Class Name: ToggleCase
Methods:
void setString(String str)
String toggle()
Description
Convert uppercase to lowercase and lowercase to uppercase.
Example
Input:"JaVa"
Output:"jAvA"*/
import java.util.*;
public class ToggleCase{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String toggle(){
		String result="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='a'&&ch<='z'){
				char c=(char)(ch-32);
				result=result+c;
			}
			else if(ch>='A' &&ch<'Z'){
				char c=(char)(ch+32);
				result=result+c;
			}
			else{
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ToggleCase t=new ToggleCase();
		System.out.println("enter String");
		String s=in.nextLine();
		t.setString(s);
		System.out.println(t.toggle());
	}
}
			
