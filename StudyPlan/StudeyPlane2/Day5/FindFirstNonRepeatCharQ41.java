/*41.Find the first non-repeated character.*/
import java.util.*;
public class FindFirstNonRepeatCharQ41{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		boolean found=false;
		for(int i=0;i<s.length();i++){
			
			int count =0;
			for(int j=0;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j)){
				count++;
				
				
			}
		}
		if(count==1){
			System.out.println(s.charAt(i));
			found=true;
			break;
		}
		}
		if(!found){
			System.out.println("not found");
		}
	}
}
				
				