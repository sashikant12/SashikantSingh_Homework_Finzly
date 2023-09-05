package HybernateCheck.bb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client1 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Login.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Login user = session.load(Login.class,1);
        System.out.println(user);Login h = session.get(Login.class,2);
        System.out.println(h);
       session.close();
    }
}
