/*20. Concatenate two strings without using `concat()`.*/
import java.util.*;
public class  ConcateateStrQ20{
	private String str1;
	private String str2;
	
	public void setString(String s1,String s2){
		str1=s1;
		str2=s2;
	}
	public String concaStr(){
		String result=str1;
		for(int i=0;i<str2.length();i++){
			result=result+str2.charAt(i);
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ConcateateStrQ20  c=new ConcateateStrQ20();
		System.out.println("enter two string");
		String s1=in.nextLine();
		String s2=in.nextLine();
		c.setString(s1,s2);
		System.out.println(c.concaStr());
	}
}