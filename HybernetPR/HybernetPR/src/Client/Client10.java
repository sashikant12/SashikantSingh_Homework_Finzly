package Client;

import Entity.Employee;
import HybernetConfig.HySession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import java.util.List;

public class Client10 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.setProjection(Projections.max("salary"));
        List<Employee> emp1 = criteria.list();
        System.out.println(emp1);

        tr.commit();
        session.close();
    }
}
