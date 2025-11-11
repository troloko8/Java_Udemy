package anotation;

@Deprecated
class A {
    public void show() {
        System.err.println("in A");
    }
}

class B  extends A { 
    @Override
    public void show() {
    // public void show1() {
        System.err.println("in B");
    }
}

public class Anotation {
    public static void main(String a[]) {
        A obj = new A();
    }
}
