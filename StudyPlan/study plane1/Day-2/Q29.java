/*29 Count even and odd numbers LC 1295*/
import java.util.*;
public class Q29{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element ");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("evencount="+evencount+ " oddcount ="+oddcount);
	}
}