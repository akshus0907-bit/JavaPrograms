// consumer By implementing in some another class: 



import java.util.*;
import java.util.function.*;
class ABC implements Consumer<Integer>{
	
	public void accept(Integer val){
		System.out.println("Square is "+val*val);
	}
	
}

public class ConsumerByAnotherClass{
	public static void main(String[]args){
		
		Consumer<Integer> c=new ABC();
		c.accept(10);
	}
}