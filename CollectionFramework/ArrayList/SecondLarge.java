/*5Find the second largest element.*/
import java.util.*;
public class SecondLarge{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		
		System.out.println("entre number of element");
		int n=in.nextInt();
		
		System.out.println("enter element");
		for(int i=0;i<n;i++){
			int num=in.nextInt();
			
			list.add(num);
		}
		int max = list.get(0); 
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
			 
            if (list.get(i) > max) {
                secMax = max; 
                max = list.get(i);
            } else if (list.get(i) > secMax && list.get(i) != max) {
                secMax = list.get(i);
			}
		}
		System.out.println("Largest element: " + max); 
		System.out.println("Second largest element: " + secMax);
	}
}	