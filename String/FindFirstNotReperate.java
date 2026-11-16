//Find the first non-repeating character

import java.util.*;
public class FindFirstNotReperate{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=in.nextLine();
		
		boolean found=false;
		for(int i=0;i<str.length();i++){
		int count=0;
		
		for(int j=0;j<str.length();j++){
			if(str.charAt(i)==str.charAt(j)){
				count++;
			}
		}
		if(count==1){
			System.out.println("First non -reperating character="+str.charAt(i));
			found=true;
			break;
			
		}
		}
		if(!found){
			System.out.println("no non-repeating character");
		}
	}
}