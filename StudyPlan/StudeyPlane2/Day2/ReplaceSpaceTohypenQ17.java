/*17. Replace all spaces with hyphens.*/

import java.util.*;
public class ReplaceSpaceTohypenQ17{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public void replceSpace(){
		String result="";
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)==' '){
				result=result+'-';
			}
			else{
				result=result+str.charAt(i);
		}
	}
	System.out.println(result);
	}
		public static void main(String[]args){
			Scanner in=new Scanner(System.in);
			ReplaceSpaceTohypenQ17 r=new ReplaceSpaceTohypenQ17();
			System.out.println("enter  string");
			String s=in.nextLine();
			r.setString(s);
			r.replceSpace();
		}
}
				