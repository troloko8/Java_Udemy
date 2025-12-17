package udemy_java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        // Сохраняем SessionFactory в локальной переменной
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // default connectivity with DB
        // DemoJDBC.main();

        // CRUD 
        // CRUDHibernate.run(sessionFactory);

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Nathan");
        a1.setTech("JS");


        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // CREATE
            session.persist(a1);
            session.getTransaction().commit();
            // System.err.println(s1);

            // GET
            // s2 = session.find(StudentHibrnate.class, 2);
            // System.err.println(s2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
