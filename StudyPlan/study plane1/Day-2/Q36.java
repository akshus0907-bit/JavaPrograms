/*36 Count frequency of array elements LC 1207*/
import java.util.*;
public class Q36{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			int count=0;
			boolean visited=false;
			for(int k=0;k<i;k++){
				if(a[k]==a[i]){
					visited=true;
					break;
				}
			}
			if(visited){
				continue;
			}
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			System.out.println(a[i]+"="+count);
		}
	}
}