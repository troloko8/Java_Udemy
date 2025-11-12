package Interface;

// @FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.err.println("In show");
    }
}
public class FunctionalInterface {
    public static void main(String a[]) {
        // A obj = new B()
        A obj = new A(){
            public void show() {
                System.err.println("In show");
            }
        };

        obj.show();
    }
}
