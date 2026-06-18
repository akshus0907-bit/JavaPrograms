/*35. Find First Non-Repeating Character
Class Name: NonRepeatingCharacter
Methods:
void setString(String str)
char getFirstNonRepeating()
Example
Input: "aabbcdde"
Output:'c'*/
import java.util.*;
public class FindNonRepeatingChar{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}00
	public char getFirstNonRepeating(){
		
		for(int i=0;i<Str.length();i++){
			int count=0;
			for(int j=0;j<Str.length();j++){
				if(Str.charAt(i)==Str.charAt(j)){
				count++;
				}
			}
		
		if(count==1){
		return Str.charAt(i);
		} 
	}
	return '\0';
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FindNonRepeatingChar f=new FindNonRepeatingChar();
		System.out.println("enter String");
		String s=in.nextLine();
		f.setString(s);
		System.out.println(f.getFirstNonRepeating());
	}
	
}