/*12. Find the first occurrence of a character.*/
import java.util.*;
public class FirtOccQ12{
	private String str;
	
	public void setString(String s){
		str=s;
	
	}
	public String getString(){
		return str;
	}
	public int CountOcc(char ch){
		;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FirtOccQ12  f=new  FirtOccQ12();
		System.out.println("enter string");
		String st=in.nextLine();
		f.setString(st);
		System.out.println("enter character");
		char ch=in.next().charAt(0);
		int result=f.CountOcc(ch);
		System.out.println("occurrences of "+ch+ "="+result);
	}
}
