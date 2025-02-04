import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Program {
public static void main(String[] args) {

    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure() // configures settings from hibernate.cfg.xml
            .build();
    
    SessionFactory sessionFactory = new MetadataSources(registry)
            .buildMetadata()
            .buildSessionFactory();

    Session session = sessionFactory.openSession();

    Person person = new Person();

    session.beginTransaction();

    person = new Person("Tomas", "Male", "Cat");
    session.save(person);
    person = new Person("Vlad", "Male", "Vampire");
    session.save(person);
    person = new Person("Selena", "Female", "Stalker");
    session.save(person);

    session.getTransaction().commit();
    session.close();
    System.out.println("Сохранение объектов Person выполнено успешно!");
    
}
}
