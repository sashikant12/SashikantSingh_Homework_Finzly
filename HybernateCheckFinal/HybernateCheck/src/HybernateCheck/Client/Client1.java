package HybernateCheck.bb;

import Entity.Login;
import HybernateSession.HySession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Client1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Login user = session.load(Login.class,1);
        System.out.println(user);Login h = session.get(Login.class,2);
        System.out.println(h);
       session.close();
    }
}
