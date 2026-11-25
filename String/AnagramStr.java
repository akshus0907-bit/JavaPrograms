//string is anagram 
import java.util.*;
public class AnagramStr{
	public static  void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string 1");
		String s=in.nextLine();
		System.out.println("enter string 2");
		String s2=in.nextLine();
		if(s.length()!=s2.length()){
			System.out.println("not anagram ");
			return;
		}
		int a[]=new int[s.length()];
		int b[]=new int[s2.length()];
		boolean flag=true;
		for(int i=0;i<s.length();i++){
			
			a[i]=s.charAt(i);
			b[i]=s2.charAt(i);
		}
		
		       
        for (int i = 0; i < a.length; i++) {

            int count = 0;

			for(int j=0;j<s.length();j++){
				if(a[i]==b[j]){
					count++;
					 b[j] = '*';
                    
					break;
				}
				
				
			}
			if(count==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("anagram");
		}
		else{
			System.out.println("not anagram");
		}
	}
}