

class Human {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String a[]) throws ClassNotFoundException 
    {
        Human obj = new Human();

        obj.setAge(33);
        obj.setName("Nathan");

        System.out.println("My name is " + obj.getName() + " Am " + obj.getAge() + " years old");
    } 
}
