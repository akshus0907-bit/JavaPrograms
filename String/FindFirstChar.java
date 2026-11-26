//find first non eperating char

import java.util.*;
public class FindFirstChar{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
					
				}
			}
			if(count==1){
				System.out.println(s.charAt(i));
				break;
			}
		}
		
	}
}