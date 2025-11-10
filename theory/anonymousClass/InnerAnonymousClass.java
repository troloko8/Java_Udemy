package anonymousClass;


abstract class A {

    public abstract void show();
    public abstract void conf();
}

public class InnerAnonymousClass {
    public static void main(String a[]) {
        A obj = new A(){
            public void show() {
                System.err.println("In anonmous ");
            }
            public void conf() {
                System.err.println("In anonmous ");
            }
        };

        obj.show();
        obj.conf();
    }
}
