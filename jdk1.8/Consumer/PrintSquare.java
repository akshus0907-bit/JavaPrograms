//print square using consumer 
import java.util.function.*;
public class PrintSquare{
	public static void main(String[]args){
		
			
		
		((Consumer<Integer>)(Integer val)->System.out.println(val*val)).accept(10);
	}
}
