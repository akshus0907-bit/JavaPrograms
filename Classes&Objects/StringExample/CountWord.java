/*8. 
8. Count Total Words
Problem Statement
Create class WordCount with methods:
void setString(String str)
int getWordCount()
Method Description
void setString(String str)
Accepts sentence.
int getWordCount()
Counts total words and returns count.
Example
Input: "Java is easy"
Output: 3
*/
import java.util.*;
public class CountWord{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getWordCount(){
		if(Str.length()==0){
			return 0;
		}
		int count=1;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch==' '){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountWord c=new CountWord();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("count="+c.getWordCount());
	}
}
