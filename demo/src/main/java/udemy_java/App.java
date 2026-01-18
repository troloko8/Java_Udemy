package udemy_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import udemy_java.clasess.actions.LazyAndEagerFetching;
import udemy_java.clasess.actions.OneAndMany;
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
        LazyAndEagerFetching.run(sessionFactory);

        try (Session session = sessionFactory.openSession()) {
            // session.beginTransaction();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
