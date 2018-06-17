package info.raghu.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.entity.Cart;
import com.hibernate.entity.Items;
import com.hibernate.utility.HibernateUtilitycls;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Cart cart = new Cart();
		cart.setId(5);
		cart.setTotal(500);
		cart.setName("ram");
		
	    Items items=new Items();
	    items.setId(1);
	    items.setItemId(2);
	    items.setItemTotal("777");
	    items.setQuantity(3);
	    
	    Items items1=new Items();
	    items1.setId(2);
	    items1.setItemId(2);
	    items1.setItemTotal("777");
	    items1.setQuantity(3);
		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(items);
		itemsSet.add(items1);

		cart.setItems(itemsSet);

    	    	
        
                
        SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try{
		//Get Session
		sessionFactory = HibernateUtilitycls.getSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Session created");
		//start transaction
		tx = session.beginTransaction();
		//Save the Model object
		//Commit transaction
		session.save(cart);
		session.save(items);
		//session.save(item2);
		tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
finally {
        session.close();
        sessionFactory.close();
} 
    }
}
