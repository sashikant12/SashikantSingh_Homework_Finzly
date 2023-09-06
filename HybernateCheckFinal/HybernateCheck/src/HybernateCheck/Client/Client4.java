package HybernateCheck.bb;

import Entity.Login;
import HybernateSession.HySession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Login login = new Login();
        login.setId(3);
        session.delete(login);
        tr.commit();
        session.close();

    }
}
