package HybernetConfig;

import Entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class HySession {
    public static SessionFactory sf(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
}
