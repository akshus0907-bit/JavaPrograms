/*Q7. Given a string, remove duplicate characters while preserving the first occurrence. Then print the 
characters in descending alphabetical order. 
Explanation - 
• Remove repeated characters.  
• Ignore spaces.  
• Sort remaining characters descending.  
• Print the result. 
Input - programming 
Output - 
Unique Characters : 
progamin 
 
Sorted Characters : 
rponmiga */
import java.util.*;
;
public class StringQ7{
private String Str;

	public void setString(String s){
		Str=s;
}
public String removeDuplicateCharacters(){           // remove duplicate char function
	String result="";                       // empty string store result
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
public String removeSpace(){                        //remove  space function 
		String s="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch!=' '){                            
				s=s+ch;
			}
		}
		return s;
	}

	public String sortCharacters(){                  // sort chart in descending order
		char ch[]=new char[Str.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=Str.charAt(i);
		}
		for(int i=0;i<ch.length-1;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]<ch[j]){
					char temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
			}
		}
		return new String(ch);
	}
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	StringQ7 r=new StringQ7();
	System.out.println("enter string");                    //take input frome user
	String s=in.nextLine();
	r.setString(s);
	System.out.println(r.removeDuplicateCharacters());
	System.out.println(r.removeSpace());
	System.out.println(r.sortCharacters());
}
}


 
