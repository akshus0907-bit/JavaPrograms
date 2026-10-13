//1.Create a stack and add 5 integers.	10, 20, 30, 40, 50
import java.util.*;
class CreateStack{
	public static void main(String[]args){
		Stack<Integer> s = new Stack<>();
		
		
		s.push(10);
		s.push(20);
		s.push(30);
		Iterator<Integer> iterator = s.iterator();
		
		while(iterator.hasNext()){
			int number=iterator.next();
			
			System.out.println(number);
		}
	}
}