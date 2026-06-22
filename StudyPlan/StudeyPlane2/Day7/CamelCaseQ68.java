/*68. Convert a sentence into camelCase.*/
import java.util.*;
public class CamelCaseQ68{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		boolean cap=false;
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch==' '){
				cap=true;
			}
			else{
				if(cap==true){
					if(ch>='a' &&ch<='z'){
						ch=(char)(ch-32);
					}
					cap=false;
				}
				else{
					if(result.length()==0){
						if(ch>='A' && ch<='Z'){
							ch=(char)(ch-32);
						}
					}
					}
					result.append(ch);
			}
		}
		
					

					System.out.println(result);
	}
}