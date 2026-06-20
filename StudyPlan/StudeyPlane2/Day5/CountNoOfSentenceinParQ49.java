/*49. Count the number of sentences in a paragraph.*/
import java.util.*;
public class CountNoOfSentenceinParQ49{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String str=in.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='.' ||ch=='!' ||ch=='?'){
				count++;
			}
		}
		System.out.println("total sentence in paragraph= "+count);
	}
}