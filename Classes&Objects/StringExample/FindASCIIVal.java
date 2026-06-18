/*22. Find ASCII Value
Class Name: ASCIIValue
Methods:
void setCharacter(char ch)
int getASCII()
Example
Input:'A'
Output:65*/

import java.util.*;
public class FindASCIIVal{
	private char ch;
	public void setCharacter(char c){
		ch=c;
	}
	public int getASCII(){
		/*if(ch>='A' &&ch<='Z'){
			int c=(char)(ch);
		}*/
		
		return (int)ch;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FindASCIIVal f=new FindASCIIVal();
		System.out.println("enter char");
		char ch=in.next().charAt(0);
		f.setCharacter(ch);
		System.out.println(f.getASCII());
	}
}
