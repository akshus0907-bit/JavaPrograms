//upper bound generic 
import java.util.*;
class Demo{
	
	static void display(List<?extends Number>list){
		double sum=0;
		for(Number value:list){
			sum=sum + value.doubleValue();
		}
		System.out.println(sum);
	}
}
public class UpperBoundWildcard{
	
	public static void main(String[]args){
		List<Integer>l1=Arrays.asList(10,20,30);
		List<Double>l2=Arrays.asList(10.3,2.4);
		
		Demo.display(l1);
		Demo.display(l2);
		
		
	}
}