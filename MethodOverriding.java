

class C {
    public void show() {
        System.err.println("Show in C");
    }
}

class D extends C {
    // Override show from C class 
    public void show() {
        System.err.println("Show in D");
    }
}

public class MethodOverriding {
    public static void main(String a[]) throws ClassNotFoundException 
    {
        D obj = new D();

        obj.show();
    } 
}
