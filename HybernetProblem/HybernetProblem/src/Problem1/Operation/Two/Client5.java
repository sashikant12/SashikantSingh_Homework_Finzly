package Problem1.Operation.Two;

import Problem1.Config.HySession;
import Problem1.Entity.Libary;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import java.util.List;

public class Client5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Libary.class);
        criteria.setProjection(Projections.property("title"));
        List<Libary> list = criteria.list();
        System.out.println(list);

        tr.commit();
        session.close();
    }
}
