//create thread using anonymous inner class
public class CreateThread{
	public static void main(String[]args){
		Runnable r=()->{
				try{
					for(int i=1;i<=5;i++){
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			}
	};
		
		Thread t=new Thread(r);
		t.start();
	}
}