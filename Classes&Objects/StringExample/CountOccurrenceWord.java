/*30. Count Occurrence of Word
Class Name: WordOccurrence
Methods:
void setData(String sentence, String word)
int getOccurrence()
Example
Input:
 Sentence: "Java is easy and Java is powerful"
Word: "Java"
Output:2*/

import java.util.*;
public class CountOccurrenceWord{
	private String Str;
	private String Word;
	
	public void setData(String sen,String w){
		Str=sen;
		Word=w;
	}
	public int getOccurrence(){
		String CurrentWord="";
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch!=' '){
				CurrentWord=CurrentWord+ch;
			}
			else{
				if(CurrentWord.equals(Word)){
					count++;
				}
			}
			if(CurrentWord.equals(Word)){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountOccurrenceWord c=new CountOccurrenceWord();
		System.out.println("enter String");
		String s=in.nextLine();
		System.out.println("enter word");
		String word=in.nextLine();
		c.setData(s,word);
		System.out.println(c.getOccurrence());
	}
}
