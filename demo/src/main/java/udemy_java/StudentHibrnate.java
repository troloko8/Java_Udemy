package udemy_java;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // for hibernate to recognize this class as an entity
public class StudentHibrnate {
    @Id // primary key for the entity for hibernate
    int rollNo;
    String name;
    int age;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
    }
}
