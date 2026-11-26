//print array using consumer
import java.util.function.*; 
public class PrintArray{
	public static void main(String[]args){
		int arr[]={10,20,40,50};
		Consumer <Integer>c=(Integer num)->System.out.println(num);
							
	
		for(int i=0;i<arr.length;i++){
		c.accept(arr[i]);
		}
	}
}