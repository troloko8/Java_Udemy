package udemy_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.processing.HQL;
import org.hibernate.query.Query;

import udemy_java.clasess.actions.HQLFetching;
import udemy_java.clasess.actions.LazyAndEagerFetching;
import udemy_java.clasess.actions.OneAndMany;
import udemy_java.clasess.entities.Alien;
import udemy_java.clasess.entities.Laptop;

public class App {
    public static void main(String[] args) {
        // Сохраняем SessionFactory в локальной переменной
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // default connectivity with DB
        // DemoJDBC.main();

        // CRUD 
        // CRUDHibernate.run(sessionFactory);

        // One to One / One to Many mapping / many to many mapping
        // OneAndMany.run(sessionFactory);

        // Lazy and Eager fetching
        // LazyAndEagerFetching.run(sessionFactory);

        // HQL fetching data
        HQLFetching.run(sessionFactory);

        try (Session session = sessionFactory.openSession()) {
            Laptop l1 = session.find(Laptop.class, 1);

            System.out.println(l1);

            session.close();

            Session session2 = sessionFactory.openSession();
            Laptop l2 = session2.find(Laptop.class, 1);

            System.out.println(l2);
            session2.close();
            // session.beginTransaction();

            // session.persist(l1);

            // session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
