//anagram string


import java.util.*;
public class StrAnagram{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter first string");
		String s1=in.nextLine();
		
		System.out.println("enter second string");
		String s2=in.nextLine();
		
		boolean isAnagram=true;
		
		if(s1.length()!=s2.length()){
			isAnagram=false;
			
		}
		
		else{
			boolean visitied[]=new boolean[s2.length()];
			for(int i=0;i<s2.length();i++){
			boolean found=false;
			
			for(int j=0;j<s2.length();j++){
				if(!visitied[j] && s1.charAt(i)==s2.charAt(j)){
					found=true;
					break;
				}
				
			}
			if(!found){
				isAnagram=false;
				break;
			}
			
			}
		}
		
		if(isAnagram){
			System.out.println("anagram");
		}
		else{
			System.out.println("not anagram");
		}
	}
}