/*31. Remove all vowels from a string.*/
import java.util.*;
public class RmoveVowelsQ31{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String removeVowels(){
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(!(ch=='a' || ch=='i' ||ch=='o' ||ch=='e'||ch=='u')
				||(ch=='A' ||ch=='E' || ch=='i' || ch=='O' || ch=='U')){
					result=result+ch;
				}
				
		}
		return result;
	}
	public static void main (String []args){
		Scanner in=new Scanner(System.in);
		RmoveVowelsQ31 r=new RmoveVowelsQ31();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.removeVowels());
	}
}
		