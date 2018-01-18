package model.dao.customer;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.CustomerDAO;
import model.dao.CustomerDAOHibernate;
import model.hibernate.HibernateUtil;

public class Update {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			CustomerDAO dao = new CustomerDAOHibernate(session);
			
			Customer bean = new Customer();
			bean.setCustid("ABXC");
			bean.setEmail("00000");
			dao.update(bean);
			
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
