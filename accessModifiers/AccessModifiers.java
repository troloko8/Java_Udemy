package accessModifiers;
import accessModifiers.classA.A;;

class C extends B {
    public void marks() {
        
        System.err.println(num);
    }


}

public class AccessModifiers {
    public static void main(String a[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.marks();
    }
}


// public class A {
    
//     int num = 13;
    
//     void marks() {
//         System.err.println("Marks method A");
//     }
// }

// public class B {
//     int num = 12;

//     void marks() {
//         System.err.println("Marks in B");
//     }
// }
