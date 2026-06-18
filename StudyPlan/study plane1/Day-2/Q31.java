/*31 Merge two arrays LC 88*/
import java.util.*;
public class Q31{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of first array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter size of second array");
		int p=in.nextInt();
		int b[]=new int[p];
		System.out.println("enter element in second array");
		for(int i=0;i<b.length;i++){
			b[i]=in.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length &&j<b.length){
			if(a[i]<b[j]){
				c[k]=a[i];
				i++;
			}
			else{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length){
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length){
			c[k]=b[j];
			j++;
			k++;
		}
		for(int x=0; x<c.length; x++){
			System.out.print(c[x] + " ");
}
	}
}