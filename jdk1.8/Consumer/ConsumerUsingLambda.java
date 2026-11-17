// consumer By implementing in  lambda expresiion : 




import java.util.function.*;
class ConsumerUsingLambda{
	public static void main(String[]args){
		
		
		
		((Consumer <Integer>)(Integer val)->System.out.println("Square is="+val*val)).accept(10);
		
	}
}