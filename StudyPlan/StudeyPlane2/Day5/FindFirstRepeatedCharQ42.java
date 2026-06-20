/*42.Find the first repeated character.*/

import java.util.*;
public class FindFirstRepeatedCharQ42{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		boolean found=false;
		for(int i=0;i<s.length();i++){
			int count =0;
			for(int j=0;j<i;j++){
				if(s.charAt(i)==s.charAt(j)){
					System.out.println(s.charAt(i));
					count++;
					found=true;
					break;
				}
			}
			if(found){
				break;
		}
		}
		if(!found){
			System.out.println("not found");
		}
	}
}
		
			