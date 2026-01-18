package udemy_java;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import udemy_java.clasess.Laptop;

public class LazyAndEagerFetching {
    public static void run(SessionFactory sessionFactory) {
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

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("MacBook Air M4");
        l3.setRam(24);

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Nathan");
        a1.setTech("JS");
        // a1.setLaptop(l1);

        Alien a2 = new Alien();
        a2.setAid(2);
        a2.setAname("Anat");
        a2.setTech("Java");

        Alien a3 = new Alien();
        a3.setAid(3);
        a3.setAname("Anatoly");
        a3.setTech("Python");

        a1.setLaptops(Arrays.asList(l1, l2));
        a2.setLaptops(Arrays.asList(l3));

        // l1.setAliens(Arrays.asList(a1, a3));
        // l2.setAliens(Arrays.asList(a1, a2));
        // l3.setAliens(Arrays.asList(a2));

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(l1);
            session.persist(l2);
            session.persist(l3);

            session.persist(a1);
            session.persist(a2);
            // session.persist(a3);
            
            session.getTransaction().commit();

            Session session2 = sessionFactory.openSession();

            Alien alienRes = session2.find(Alien.class, 1);
            System.err.println(alienRes);
            session2.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            // sessionFactory.close();
        }
    }    
}
