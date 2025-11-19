package threads;

import java.util.Set;

class Counter {
    int count;

    // without synchronized keyword 2 threads work woth 1 common var unpredicatable
    // public void increment() {
    public synchronized void increment() {
        count++;
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.err.println(c.count);
    }
}
