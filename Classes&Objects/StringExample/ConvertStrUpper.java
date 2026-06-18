/*5. Convert String to Uppercase
Problem Statement
Create class UpperCaseConvert with methods:
void setString(String str)
String getUpperCase()
Method Description
void setString(String str)
Stores string.
String getUpperCase()
Converts lowercase letters into uppercase and returns result.
Example
Input: "java"
Output: "JAVA"
*/
import java.util.*;
public class ConvertStrUpper{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String getUpperCase(){
		String upper="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='a'&&ch<='z'){
				ch=(char)(ch-32);
			}
				upper=upper+ch;
			
		}
			return upper;
		
	}
		public static void main(String[]args){
			Scanner in=new Scanner(System.in);
			ConvertStrUpper c =new ConvertStrUpper();
			System.out.println("enter string");
			String s=in.nextLine();
			c.setString(s);
			System.out.println("upper case="+c.getUpperCase());
		
	}
}
