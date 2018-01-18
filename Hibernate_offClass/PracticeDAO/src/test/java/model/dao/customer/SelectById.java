package model.dao.customer;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.CustomerDAO;
import model.dao.CustomerDAOHibernate;
import model.hibernate.HibernateUtil;

public class SelectById {

	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			CustomerDAO dao = new CustomerDAOHibernate(session);
			
			System.out.println(dao.select("Alex"));
			
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
