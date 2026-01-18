package udemy_java.clasess.actions;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import udemy_java.clasess.entities.Laptop;

public class HQLFetching {
    public static void run(SessionFactory sessionFactory) {
        // Laptop l1 = new Laptop();
        //     l1.setLid(5);
        //     l1.setBrand("BLABLA");
        //     l1.setModel("bLa");
        //     l1.setRam(32);

        try (Session session = sessionFactory.openSession()) {
            // select * from Laptop where ram=32 -> SQL
            // from Laptop where ram=32

            //OLD ONE
            // Query query = session.createQuery("from Laptop");
            // query.getResultList();

            List<Laptop> list = session
                .createSelectionQuery("from Laptop where ram=32", Laptop.class)
                .getResultList();

            System.out.println(list);

            // session.beginTransaction();

            // session.persist(l1);

            // session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем SessionFactory при завершении работы приложения
            // sessionFactory.close();
        }
    }
}
