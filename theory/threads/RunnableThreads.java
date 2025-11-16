package threads;

public class RunnableThreads {
    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 1; i <= 100; i++) {
                System.err.println("Hi " + i);
                
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        };

        Runnable b = new Runnable() {
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
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
