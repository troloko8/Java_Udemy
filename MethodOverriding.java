import java.util.ArrayList;

// import tool.C;
// import tool.D;
//OR
import tool.*;
import java.lang.System;

// By default behavior under the hood
// import java.lang.*; 

// class C {
//     public void show() {
//         System.err.println("Show in C");
//     }
// }

// class D extends C {
//     // Override show from C class 
//     public void show() {
//         System.err.println("Show in D");
//     }
// }

public class MethodOverriding {
    public static void main(String a[]) throws ClassNotFoundException 
    {
        D obj = new D();

        ArrayList list = new ArrayList();

        obj.show();

        System.err.println();
    } 
}
