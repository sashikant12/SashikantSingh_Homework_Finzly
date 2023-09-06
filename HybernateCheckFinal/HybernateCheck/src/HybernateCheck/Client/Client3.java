package HybernateCheck.bb;

import Entity.Login;
import HybernateSession.HySession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Login login = new Login();
        login.setId(3);
        //Rahaul to raj
        login.setUsername("Raj");
        //12212
        login.setPassWord("12212");
        session.update(login);
        tr.commit();
        session.close();

    }
}
