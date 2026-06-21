/*50. Find the longest word in a sentence.*/
import java.util.*;
public class LongestWordinSentenceQ50{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter String");
		String s=in.nextLine();
		String currentWord="";
		String longestWord="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				currentWord=currentWord+s.charAt(i);
			}
			else{
				if(currentWord.length()>longestWord.length()){
					longestWord=currentWord;
				}
				currentWord="";
			}
		}
		if(currentWord.length()>longestWord.length()){
			longestWord=currentWord;
		}
		System.out.println("longest Word= "+longestWord);
		System.out.println("length= "+longestWord.length());
	}
}