

class A {
    public A() {
        System.err.println("In A");
    }

    public A(int n) {
        System.err.println("Int in A");
    }

}
class B extends A {
    public B() {
        super();
        System.err.println("In B");
    }

    public B(int n) {
        // this() means that we call the constructor of the class which it was be invoked
        this("sd");
        // super(n);

        System.err.println("Int in B");
    }
    
    public B(String n) {
        // super method(always exist nonetheless we write it or not) it means that we call constructor of SUPER CLASS (from which class extends current class)
        super(10);
        
        System.err.println("STR in B");
    }

}

public class ThisAndSuperMathod {
    public static void main(String a[]) throws ClassNotFoundException 
    {
        B obj = new B(5);
    } 
}
