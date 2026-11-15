//Remove duplicate characters


import java.util.*;
public class RemoveDuplicate1{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=in.nextLine();
		
		String rev="";
		
		for(int i=0;i<str.length();i++){
			boolean found=false;
			for(int j=0;j<rev.length()-1;j++){
				if(str.charAt(i)==rev.charAt(j)){
					found=true;
					break;
				}
			}
			
			if(!found){
				rev=rev+str.charAt(i);
			}
		}
		
		
		System.out.println(rev);
		
		
		
	}
}