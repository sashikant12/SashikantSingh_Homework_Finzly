package HybernateSession;

import Entity.Login;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class  HySession {
    public static SessionFactory sf(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Login.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
}
