import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Student s=session.get(Student.class,1);
        System.out.println(s);
        t.commit();
}
}



