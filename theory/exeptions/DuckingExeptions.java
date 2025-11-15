package exeptions;

class A {
    public void show(String className) throws ClassNotFoundException {
        // Default exeption handling 

        // try {
        //     Class.forName(className);
        // } catch (ClassNotFoundException e) {
        //     System.err.println("Not able to find the class - " + className);
        // }

        Class.forName(className);
    }
}

public class DuckingExeptions {

    static {
        System.err.println("DuckingExeptions is initiated");
    }
    
    public static void main(String[] args) {
        A obj = new A();

        String className = DuckingExeptions.class.getName();

        try {
            obj.show(className + 'X');
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
