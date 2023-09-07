package Problem1.Config;


import Problem1.Entity.Libary;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class HySession {
    public static SessionFactory sf(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Libary.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
}
