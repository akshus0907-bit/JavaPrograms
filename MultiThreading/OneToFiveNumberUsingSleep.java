/*Print numbers from 1 to 5 with a one-second delay between numbers.

Concept: Thread.sleep(1000).*/


class MyThread extends Thread {
    public void run()  {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
		}
		try{
			Thread.sleep(60000);
		}
		catch(InterruptedException e) {
                System.out.println(e);
		}
			
		
            
        }
    }


public class OneToFiveNumberUsingSleep {
    public static void main(String[] args)  {
        MyThread m = new MyThread();
        m.start();
    }
}
