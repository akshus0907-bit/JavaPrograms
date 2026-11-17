////consumer using forEach   Anonymous  inner class
import java.util.*;
import java.util.function.*;

class ConsumerForEachAno {
	public static void main(String[]args){
	List<Integer> l=List.of(10,20,30);
	Consumer <Integer>c=new Consumer<>(){
	public void accept(Integer val){
		System.out.println("square="+val*val);
	}
	
	
	
};

		
		l.forEach(c);
		
	}
	}
