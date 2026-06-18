/*45 Function to calculate power LC 50*/
import java.util.*;
public class Q45{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter base and index");
		int base=in.nextInt();
		int index=in.nextInt();
		
		int result=power(base,index);
		System.out.println(result);
	}
	static int power(int base,int index){
		int pow=1;
		for(int i=1;i<=index;i++){
			pow=pow*base;
		}
		return pow;
	}
}
		
