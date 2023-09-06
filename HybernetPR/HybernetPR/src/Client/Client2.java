package Client;

import Entity.Employee;
import HybernetConfig.HySession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.like("name","Baka"));
        List<Employee> list = criteria.list();
        for (Employee employee:list ) {
            System.out.println(employee);
        }

        tr.commit();
        session.close();
    }
}
