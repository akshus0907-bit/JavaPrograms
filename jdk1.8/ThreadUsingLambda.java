//creating thread without creating user define class

class ThreadUsingLambda{
	public static void main(String[]args){
	
	
	Thread t=new Thread(new Runnable(){
	
	public void run(){
		try{
			for(int i=0;i<5;i++){
			System.out.println("I is "+i);
			Thread.sleep(1000);
		}
	}
	
	catch(Exception ex){
		System.out.println(ex);
	}
	}
});
	t.start();
	
	
}
}