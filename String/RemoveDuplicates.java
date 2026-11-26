//remove duplicate from string 
import java.util.*;
public class RemoveDuplicates{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		
		for(int i=0;i<s.length();i++){
			boolean flag=true;
			for(int j=0;j<i;j++){
				if(s.charAt(i)==s.charAt(j)){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(s.charAt(i));
			}
		}
	}
	
}