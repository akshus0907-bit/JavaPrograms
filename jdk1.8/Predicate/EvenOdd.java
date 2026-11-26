//find even and odd using predicate

import java.util.function.*;
public class EvenOdd{
	public static void main(String[]args){

			
			if(((Predicate<Integer>)(Integer val)-> val%2==0).test(20)){
				System.out.println("number is even");
			}
			else {
				System.out.println("number is odd");
			}
		}
	}
