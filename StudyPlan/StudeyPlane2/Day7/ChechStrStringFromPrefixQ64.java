/*64. Check whether a string starts with a given prefix.*/
import java.util.*;
public class ChechStrStringFromPrefixQ64{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter string");
	String s=in.nextLine();
	System.out.println("enter perfix");
	String p=in.next();
	boolean flag=true;
	if(p.length()>s.length()){
		flag=false;
	}
	else{
		for(int i=0;i<p.length();i++){
    if(s.charAt(i)==p.charAt(i)){
        System.out.println(p.charAt(i) + " found at index " + i);
    }
    else{
        flag=false;
        break;
    }
		}
	}
	}
}