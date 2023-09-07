package Problem1.Operation.Two;

import Problem1.Config.HySession;
import Problem1.Entity.Libary;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Client4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
//        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Libary.class);
        criteria.add(Restrictions.eq("ISBN",1));
        List<Libary> list = criteria.list();
        for (Libary employee:list ) {
            System.out.println(employee);
        }

        tr.commit();
        session.close();
    }

}
