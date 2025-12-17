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
        a1.setLaptop(new udemy_java.clasess.Laptop());
        a1.getLaptop().setBrand("Apple");
        a1.getLaptop().setModel("MacBook Pro");
        a1.getLaptop().setRam(16);


        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(a1);
            session.getTransaction().commit();

            Alien s2 = session.find(Alien.class, 1);
            System.err.println(s2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
