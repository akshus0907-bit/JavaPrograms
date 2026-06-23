/*71. Implement your own version of `String.equals()`.*/
import java.util.*;
public class StrEqualsImplementQ71{
	static boolean IsEqual(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		boolean flag=false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(i)){
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter  two string");
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		boolean result=IsEqual(str1,str2);
		System.out.println(result);
	}
}
		
		
	

			