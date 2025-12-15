package udemy_java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // default connectivity with DB
        // DemoJDBC.main();

        Student s1 = new Student();
        s1.setName("Nata");
        s1.setRollNo(101);
        s1.setAge(30);

        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        // instead of .save
        session.persist(args); 

        System.err.println(s1);


    }
}
