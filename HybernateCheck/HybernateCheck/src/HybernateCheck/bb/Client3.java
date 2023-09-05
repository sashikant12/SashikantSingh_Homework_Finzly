package HybernateCheck.bb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client3 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Login.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
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
