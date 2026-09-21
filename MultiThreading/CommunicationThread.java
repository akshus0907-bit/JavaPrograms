/*Question 15: Write a Java program to demonstrate thread communication using wait() and notify().

Create producer and consumer threads. The producer produces data and the consumer waits until data is available.
Asked In Practice Assignment
Input:
No input required

Output:
Producer produced data
Consumer consumed data

Explanation:
wait() method causes thread to release lock and wait until notify() is called. Producer thread calls notify() when data is ready, waking consumer thread. Consumer thread calls wait() when data unavailable. Synchronizes producer-consumer execution and prevents busy waiting. Improves thread efficiency.*/

class Data {

    int value;
    boolean available = false;

    synchronized void produce() {

        value = 100;
        available = true;

        System.out.println("Producer produced data");

        notify();
    }

    synchronized void consume() {

        try {

            while (!available) {
                wait();
            }

            System.out.println("Consumer consumed data");

            available = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {

    Data d;

    Producer(Data d) {
        this.d = d;
    }

    public void run() {
        d.produce();
    }
}

class Consumer extends Thread {

    Data d;

    Consumer(Data d) {
        this.d = d;
    }

    public void run() {
        d.consume();
    }
}

public class CommunicationThread {

    public static void main(String[] args) {

        Data d = new Data();

        Consumer c = new Consumer(d);
        Producer p = new Producer(d);

        c.start();
        p.start();
    }
}