package model.dao.emp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.EmpDAO;
import model.dao.EmpDAOHibernate;
import model.hibernate.HibernateUtil;

public class SelectById {

	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			EmpDAO dao = new EmpDAOHibernate(session);

			System.out.println(dao.select(1));

			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
