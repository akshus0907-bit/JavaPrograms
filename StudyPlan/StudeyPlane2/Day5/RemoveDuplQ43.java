/*Remove duplicate characters from a string.*/
import java.util.*;
public class RemoveDuplQ43{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		String result="";
		for(int i=0;i<s.length();i++){
		boolean visisted =false;
		
		for(int j=0;j<i;j++){
			if(s.charAt(i)==s.charAt(j)){
				visisted=true;
				break;
			}
		}
		if(!visisted){
			result=result+s.charAt(i);
		}
	}
	System.out.println(result);
	}
}
		