package model.dao.product;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.ProductDAO;
import model.dao.ProductDAOHibernate;
import model.hibernate.HibernateUtil;

public class Delete {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			ProductDAO dao = new ProductDAOHibernate(session);
			
			dao.delete(99);
			
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
