package Interface;

interface A {
    int age = 44; // all variables in interface are final and static by dedault
    String area = "Kiev";

    void show(); // all methods in interface are pubic and static by default

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.err.println("In show");
    }

    public void config() {
        System.err.println("In config");
    }

    public void run() {
        System.err.println("In config");
    }
}

public class Interface {
    public static void main(String a[]) {
        A obj = new B();

        obj.show();
        obj.config();
        // obj.run(); A doesn't know about run()

        X obj1 = new B();
        obj1.run();

        System.err.println(A.area);
    }
}
