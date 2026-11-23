//binary seacrh
import  java.util.*;
public class BinarySearch{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]={10,2,3,4,7};
		
		Arrays.sort(a);
		
		System.out.println("enter search key");
		int key=in.nextInt();
		
		int L=0;
		int R=a.length-1;
		int mid=0;
		int index=-1;
		
		while(L<=R){
			mid=L+(R-L)/2;
			
			if(a[mid]==key){
				index=mid;
				break;
			}
			else if(a[mid]<key){
				L=mid+1;
			}
			else{
				R=mid-1;
			}
		}
		if(index!=-1){
			System.out.println("key found");
		}
		else{
			System.out.println("key not found");
		}
	}
}