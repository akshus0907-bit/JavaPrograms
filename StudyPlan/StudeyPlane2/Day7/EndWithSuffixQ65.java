/*65. Check whether a string ends with a given suffix.*/
import java.util.*;
public class EndWithSuffixQ65{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		System.out.println("enter siffix");
		String f=in.next();
		boolean flag=true;
		if(f.length()>s.length()){
			flag=false;
		}
		else{
			int start=s.length()-f.length();
			for(int i=0;i<f.length();i++){
				if(s.charAt(start+i)==f.charAt(i)){
					System.out.println(f.charAt(i)+"=found at index= "+(start+i));
				}
			
			    else{
				flag=false;
				break;
				}
			}
		}
		if (flag)
            System.out.println("Suffix Found");
        else
            System.out.println("Suffix Not Found");
    }
}