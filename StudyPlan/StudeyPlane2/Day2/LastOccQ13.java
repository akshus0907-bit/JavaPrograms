/*13. Find the last occurrence of a character.*//*12. Find the first occurrence of a character.*/
import java.util.*;
public class LastOccQ13{
	private String str;
	
	public void setString(String s){
		str=s;
	
	}
	public String getString(){
		return str;
	}
	public int CountOcc(char ch){
		;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==ch){
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		LastOccQ13 l  =new  LastOccQ13();
		System.out.println("enter string");
		String st=in.nextLine();
		l.setString(st);
		System.out.println("enter character");
		char ch=in.next().charAt(0);
		int result=l.CountOcc(ch);
		System.out.println("occurrences of "+ch+ "="+result);
	}
}
