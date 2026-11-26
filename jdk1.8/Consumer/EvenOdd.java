//print even number using consumer

import java.util.function.*;
public class EvenOdd{
	public static void main(String[]args){
		Consumer <Integer>c=new Consumer<Integer>(){
			public void accept(Integer val){
			if(val%2==0){
				System.out.println("number is even");
			}
			else{
				System.out.println("number is odd");
			}
			}
		};
		c.accept(10);
	}
}