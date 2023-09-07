package Problem2.Operation;

import Problem2.Config.HySession;
import Problem2.Entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Employee1 login =session.get(Employee1.class,1);
        System.out.println(login);
        session.save(login);
        session.close();
    }
}
