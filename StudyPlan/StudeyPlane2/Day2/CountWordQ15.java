/*15. Count the number of words in a sentence.*/
import java.util.*;
public class CountWordQ15{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public int countWord(){
		int count=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				count++;
			}
		} 
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountWordQ15 c=new CountWordQ15();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.countWord());
	}
}
		