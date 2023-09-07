package Problem2.Config;


import Problem2.Entity.Employee1;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class HySession {
    public static SessionFactory sf(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee1.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
}
