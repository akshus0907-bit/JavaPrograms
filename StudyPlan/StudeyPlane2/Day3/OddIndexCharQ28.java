/*28. Print characters at odd indexes.*/
import java.util.*;
public class OddindexCharQ28{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public String evenIndex(){
		String result="";
		for(int i=0;i<str.length();i++){
			if(i%2!=0){
				result=result+str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		OddindexCharQ28 e=new OddindexCharQ28();
		System.out.println("enter String ");
		String s=in.nextLine();
		e.setString(s);
		System.out.println(e.evenIndex());
	}
}