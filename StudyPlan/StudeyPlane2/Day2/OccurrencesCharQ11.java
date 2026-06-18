/*11. Count the occurrences of a particular character.*/
import java.util.*;
public class OccurrencesCharQ11{
	private String str;
	
	public void setString(String s){
		str=s;
	
	}
	public String getString(){
		return str;
	}
	public int CountOcc(char ch){
		int count =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		OccurrencesCharQ11 o=new OccurrencesCharQ11();
		System.out.println("enter string");
		String st=in.nextLine();
		o.setString(st);
		System.out.println("enter character");
		char ch=in.next().charAt(0);
		int result=o.CountOcc(ch);
		System.out.println("occurrences of "+ch+ "="+result);
	}
}
