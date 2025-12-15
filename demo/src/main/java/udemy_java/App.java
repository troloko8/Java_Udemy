package udemy_java;

import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        // default connectivity with DB
        // DemoJDBC.main();

        StudentHibrnate s1 = new StudentHibrnate();
        s1.setName("ДДАРТ ВЕЙДЕР");
        s1.setRollNo(2);
        s1.setAge(10);

        // Сохраняем SessionFactory в локальной переменной
        var sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // Вместо .save
            session.persist(s1);
            session.getTransaction().commit();

            System.err.println(s1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            sessionFactory.close();
        }
    }
}
