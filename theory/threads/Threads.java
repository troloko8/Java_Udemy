package threads;

// creating thread by extending Thread class
class A extends Thread {
    // no matters what you call the method name but to make thread work it must be run
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.err.println("Hi " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.err.println("Hello " + i);
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // to start the thread we need to call start method
        a.start();
        b.start();
    }
}
