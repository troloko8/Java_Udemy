package udemy_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import udemy_java.clasess.Laptop;

public class App {
    public static void main(String[] args) {
        // Сохраняем SessionFactory в локальной переменной
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // default connectivity with DB
        // DemoJDBC.main();

        // CRUD 
        // CRUDHibernate.run(sessionFactory);

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Apple");
        l1.setModel("MacBook Pro");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Apple");
        l2.setModel("MacBook Air");
        l2.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Nathan");
        a1.setTech("JS");
        // a1.setLaptop(l1);
        a1.setLaptops(Arrays.asList(l1, l2));

        l1.setAlien(a1);
        l2.setAlien(a1);
        
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(l1);
            session.persist(l2);
            session.persist(a1);
            
            session.getTransaction().commit();

            Alien s2 = session.find(Alien.class, 1);
            // Laptop l2 = session.find(Laptop.class, 1);
            System.err.println(s2);
            // System.err.println(l2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
