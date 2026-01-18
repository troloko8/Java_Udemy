package udemy_java;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import udemy_java.clasess.Laptop;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // not effective way to configure Hibernate
            // but useful for demonstration and small applications
            // because Configuration file is very heavy for implementation each time!
            Configuration cfg = new Configuration();

            // JDBC
            cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            cfg.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
            cfg.setProperty("hibernate.connection.username", "postgres");
            // cfg.setProperty("hibernate.connection.password", "0000");
            cfg.setProperty("hibernate.connection.password", "1001");

            // Hibernate
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            // cfg.setProperty("hibernate.hbm2ddl.auto", "update");
            cfg.setProperty("hibernate.hbm2ddl.auto", "create");
            cfg.setProperty("hibernate.show_sql", "true");
            // cfg.setProperty("hibernate.format_sql", "true");

            
            // Performance
            cfg.setProperty("hibernate.bytecode.use_reflection_optimizer", "false");
            cfg.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
            System.setProperty("org.jboss.logging.provider", "slf4j");

            // Entities
            cfg.addAnnotatedClass(StudentHibrnate.class);
            cfg.addAnnotatedClass(Alien.class);
            cfg.addAnnotatedClass(Laptop.class);

            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());

            return cfg.buildSessionFactory(builder.build());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to build SessionFactory");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
