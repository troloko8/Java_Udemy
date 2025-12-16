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
        CRUDHibernate.run(sessionFactory);
    }
}
