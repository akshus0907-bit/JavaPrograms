/*7. Find Length of String
Problem Statement
Create class StringLength with methods:
void setString(String str)
int getLength()
Method Description
void setString(String str)
Stores string.
int getLength()
Returns total number of characters in string.
Example
Input: "Programming"
Output: 11
*/
import java.util.*;
public class FindLengthStr{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getLength(){
		/*int length=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			length++;
		}*/
		return Str.length();
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FindLengthStr f=new FindLengthStr();
		System.out.println("enter string");
		String s=in.nextLine();
		f.setString(s);
		System.out.println("length="+f.getLength());
	}
}