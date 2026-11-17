//consumer using forEach
import java.util.*;
import java.util.function.*;

class ABC implements Consumer<Integer>{
	
	public void accept(Integer val){
		System.out.println("square="+val*val);
	}
}

public class ConsumerUsingForEach{
	public static void main(String[]args){
		
		
		List<Integer> l=List.of(10,20,30);
		Consumer<Integer> c=new ABC();
		
		l.forEach(c);
		
	}
}