package Problem1.Operation.Four;

import Problem1.Config.HySession;
import Problem1.Entity.Libary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Libary libary = session.get(Libary.class,2);
        session.delete(libary);
        tr.commit();
        session.close();
    }
}
