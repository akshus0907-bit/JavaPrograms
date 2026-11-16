//creating thread without annoyomus inner class 

class ThreadWithoutAnoyClass{
	public static void main(String[]args){
		Runnable r=()->{
			try{
				for(int i=0;i<5;i++){
					System.out.println("I is "+i);
					Thread.sleep(1000);
				}
				
			}
			catch(Exception ex){
				System.out.println(ex);
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}