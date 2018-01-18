package model.dao.customer;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.CustomerDAO;
import model.dao.CustomerDAOHibernate;
import model.hibernate.HibernateUtil;

public class SelectAll {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			CustomerDAO dao = new CustomerDAOHibernate(session);

			List<Customer> result = dao.select();
			for (Customer bean : result) {
				System.out.println(bean);
			}

			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
