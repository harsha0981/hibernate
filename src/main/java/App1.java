import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.imageio.spi.ServiceRegistry;
public class App1 {
    public static void main(String[] args) {
        Student s=new Student();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        System.out.println(configuration.getProperty("hibernate.connection.url"));
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        //SessionFactory sf=con.buildSessionFactory();
        Session s1=sessionFactory.openSession();
        Transaction t= s1.beginTransaction();
        s=(Student)s1.get(Student.class,1);
        t.commit();
        System.out.println(s);
    }
}



