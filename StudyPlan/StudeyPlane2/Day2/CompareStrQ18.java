/*18. Compare two strings without using `equals()`.*/
import java.util.*;
public class CompareStrQ18{
	private String s1;
	private String s2;
	
	public void setString(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
		
	}
	
	
	public boolean compareStr(){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CompareStrQ18 s=new CompareStrQ18();
		System.out.println("enter  two string");
		String p=in.nextLine();
		String q=in.nextLine();
		s.setString(p,q);
		
		System.out.println(s.compareStr());
	}
}