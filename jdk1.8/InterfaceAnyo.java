//normal interface code with anyonomus inner class 

interface InterfaceApp{
	
	void show();

	}
	
public class InterfaceAnyo{
	public static void main(String[]args){
		InterfaceApp a=()->{
				System.out.println("i am show method");
			
		};
		a.show();
	}
}