package model.dao.customer;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.CustomerDAO;
import model.dao.CustomerDAOHibernate;
import model.hibernate.HibernateUtil;

public class Insert {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			CustomerDAO dao = new CustomerDAOHibernate(session);
			
			Customer bean = new Customer();
			bean.setCustid("ABXC");
			dao.insert(bean);
			
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
