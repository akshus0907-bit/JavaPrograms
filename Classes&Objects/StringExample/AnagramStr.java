/*18. Check Anagram String
Class Name: AnagramCheck
Methods:
void setStrings(String s1, String s2)
boolean isAnagram()
Description
Checks whether both strings contain same characters.
Example
Input:"listen", "silent"
Output:true*/

import java.util.*;
public class AnagramStr{
	private String Str1;
	private String Str2;
	
	public void setStrings(String s1,String s2){
		Str1=s1;
		Str2=s2;
	}
	public boolean isAnagram(){
		if(Str1.length()!=Str2.length()){
			return false;
		}
		boolean visited[]=new boolean[Str2.length()];
		for(int i=0;i<Str1.length();i++){
			boolean found=false;
			for(int j=0;j<Str2.length();j++){
				if(Str1.charAt(i)==Str2.charAt(j)&&!visited[j]){
					visited[j]=true;
					found=true;
					break;
				}
			}
			if(!found){
				return false;
		}
		}
		return true;
		
	}

	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		AnagramStr a=new AnagramStr();
		System.out.println("enter first string");
		String s1=in.nextLine();
		System.out.println("enter second string");
		String s2=in.nextLine();
		a.setStrings(s1,s2);
		System.out.println(a.isAnagram());
	}
}


