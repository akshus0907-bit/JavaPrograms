/*22 Find minimum element LC 153*/
import java.util.*;
public class Q22{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("min number is="+min);
	}
}