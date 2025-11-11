package Interface;

interface A {
    int age = 44; // all variables in interface are final and static by dedault
    String area = "Kiev";

    void show(); // all methods in interface are pubic and static by default

    void config();
}

class B implements A {
    public void show() {
        System.err.println("In show");
    }

    public void config() {
        System.err.println("In config");
    }
}

public class Interface {
    public static void main(String a[]) {
        A obj = new B();

        obj.show();
        obj.config();

        System.err.println(A.area);
    }
}
