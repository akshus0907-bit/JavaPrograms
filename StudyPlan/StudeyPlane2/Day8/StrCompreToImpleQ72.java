/*72. Implement your own version of `String.compareTo()`.*/
import java.util.*;
public class StrCompreToImpleQ72{
	static int isCompre(String s1,String s2){
		int minlength=Math.min(s1.length(),s2.length());
		for(int i=0;i<minlength;i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return (s1.charAt(i)-s2.charAt(i));
			}
		}
		return(s1.length()-s2.length());
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two string");
		String s1=in.nextLine();
		String s2=in.nextLine();
		 int result=isCompre(s1,s2);
		 if(result==0){
			 System.out.println("string is equal");
		 }
		else if(result>0){
			System.out.println("first string is equal");
		}
		else{
			System.out.println("string 2 is greater");
		}
	}
}
			
		
	