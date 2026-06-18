/*16. Remove Duplicate Characters
Class Name: RemoveDuplicate
Methods:
void setString(String str)
String removeDuplicateCharacters()
Description
Removes repeated characters from string.
Example
Input:"programming"
Output: "progamin"*/
 
import java.util.*;
public class RemoveDuplicate{
private String Str;

	public void setString(String s){
		Str=s;
}
public String removeDuplicateCharacters(){
	String result="";
	for(int i=0;i<Str.length();i++){
		char ch=Str.charAt(i);
		boolean duplicate=false;
		for(int j=0;j<result.length();j++){
			if(ch==result.charAt(j)){
				duplicate=true;
				break;
			}
		}
			if(duplicate==false){
				result=result+ch;
			
		}
	}
	return result;
}
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	RemoveDuplicate r=new RemoveDuplicate();
	System.out.println("enter string");
	String s=in.nextLine();
	r.setString(s);
	System.out.println(r.removeDuplicateCharacters());
}
}


 
