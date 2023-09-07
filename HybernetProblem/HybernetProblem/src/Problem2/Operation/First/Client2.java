package Problem2.Operation;

import Problem2.Config.HySession;
import Problem2.Entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Employee1 login = new Employee1();
        login.setId(1);
        login.setFname("Ballu");
        login.setDob("2006");
        login.setLname("Blowit");
        login.setDept("M");
        login.setEmail("S12@12");
        login.setSalary("50000");
        session.update(login);
        tr.commit();
        session.close();
    }
}
