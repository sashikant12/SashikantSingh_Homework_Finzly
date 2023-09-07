package Problem1.Operation.One;

import Problem1.Config.HySession;
import Problem1.Entity.Libary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HySession.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Libary login = new Libary();
        login.setISBN(2);
        //Rahaul to raj
        login.setAuthor("Mallu");
        //12212
        login.setPyear("2002");
        login.setTitle("Move it");
        session.save(login);
        tr.commit();
        session.close();

    }
}
