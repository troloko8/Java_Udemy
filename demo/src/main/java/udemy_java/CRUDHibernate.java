package udemy_java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CRUDHibernate {
    public static void run(SessionFactory sessionFactory) {
        StudentHibrnate s1 = new StudentHibrnate();
        s1.setName("LALA2");
        s1.setRollNo(2);
        s1.setAge(11);

        StudentHibrnate s2 = null;

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // CREATE
            // session.persist(s1);
            // session.getTransaction().commit();
            // System.err.println(s1);

            // GET
            // s2 = session.find(StudentHibrnate.class, 2);
            // System.err.println(s2);

            // UPDATE
            s1.setName("LALA3");
            s1.setRollNo(3);
            s1.setAge(2);

            // selecting 
            session.merge(s1);
            // updating
            session.getTransaction().commit();
            System.err.println(s1);

            // DELETE
            // s1 = session.find(StudentHibrnate.class, 3);
            // session.remove(s1);
            // session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
