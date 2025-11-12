package anonymousClass;


abstract class A {
    abstract void show();
    abstract void conf();
}

public class InnerAnonymousClass {
    public static void main(String a[]) {
        A obj = new A(){
            void show() {
                System.err.println("In anonmous ");
            }
            void conf() {
                System.err.println("In anonmous ");
            }
        };

        obj.show();
        obj.conf();
    }
}
