////consumer using forEach  lambda
import java.util.*;
import java.util.function.*;

class ConsumerForEachLambda {
	public static void main(String[]args){
	List<Integer> l=List.of(10,20,30);
	//((Consumer <Integer>)c=(Integer val)->System.out.println("square="+val*val);
	

		
		l.forEach((val)->System.out.println("square="+val*val));
		
	}
	}
