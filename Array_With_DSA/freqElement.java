//frequence of element 


import java.util.*;

public class freqElement{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		
		boolean found=false;
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(a[i]==a[j]){
					
					count++;
					found=true;
					
				}
				
			}
			System.out.println(a[i]+"="+count);
		}
		
	}
}