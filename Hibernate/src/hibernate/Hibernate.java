package hibernate;

/**
 *
 * @author Zac Allen
 */
 
import hibernate.FoodObject;
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction; 

public class Hibernate {
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        FoodObject newFood = new FoodObject();
        newFood.setIdentifier(137);
        newFood.setFoodCategory("Italian");
        newFood.setFoodType("Chicken Alfredo");
        
        session.save(newFood);
        session.commit();
        System.out.println("Food has been sent");
        factory.close();
        session.close();
}
