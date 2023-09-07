package Problem2.Operation.Second;

import Problem2.Config.HySession;
import Problem2.Entity.Employee1;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Client3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee1.class);
        criteria.add(Restrictions.ne( "dept","T"));
        List<Employee1> li = criteria.list();
        for (Employee1 employee: li ) {
            System.out.println(employee);
        }
    }

}
