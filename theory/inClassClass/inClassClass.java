package inClassClass;

class A {
    int age = 10;

    public void show() {
        System.err.println("in show");
    }

    // class InnerinClass {
    static class InnerinClass {
    
        public void innerShow() {
            System.err.println(" inner show");
        }    
    }
}

public class inClassClass {
    public static void main(String a[]) {
        A obj = new A();
        // A.InnerinClass obj1 = obj.new InnerinClass();
        A.InnerinClass obj1 = new A.InnerinClass();
    
        obj.show();
        obj1.innerShow();
    }
}
