//if exception occurs on try block and there is not any catch block to handle it 

public class TryWithOutCatch{
	public static void main(String[]args){
		try{
			int a=10;
			int b=0;
			
			int div=a/b;
			System.out.println(div);
		}
		catch(NullPointerException ex){
			System.out.println(ex);
		}
	}
}