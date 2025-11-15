package threads;

// creating thread by extending Thread class
class A extends Thread {
    // no matters what you call the method name but to make thread work it must be run
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.err.println("Hi " + i);
            
            try {
                // Thred.sleep method is used to pause the execution of current thread for specified milliseconds
                Thread.sleep(1);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.err.println("Hello " + i);

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // {NOTE}
        // default priority is 5
        // from 1 to 10
        // System.err.println("Priority of thread a: " + a.getPriority());

        // to start the thread we need to call start method
        a.start();
        b.start();
    }
}
