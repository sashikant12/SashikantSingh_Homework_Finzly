package Problem2.Operation;

import Problem2.Config.HySession;
import Problem2.Entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Employee1 login = new Employee1();
        login.setId(4);
        login.setFname("Mallu");
        login.setDob("2002");
        login.setLname("Moveit");
        login.setDept("D");
        login.setEmail("S@12");
        login.setSalary("20000");
        session.save(login);
        tr.commit();
        session.close();
    }
}
