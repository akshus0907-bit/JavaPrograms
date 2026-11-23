
class MyThread1 extends Thread {
    public void run() {
        synchronized(this) {
            try {
                System.out.println("Thread 1 is waiting");
                wait();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 10; i <= 15; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class WaitDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
