package model.dao.emp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Emp;
import model.EmpDAO;
import model.dao.EmpDAOHibernate;
import model.hibernate.HibernateUtil;

public class SelectAll {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			EmpDAO dao = new EmpDAOHibernate(session);
			
			List<Emp> result= dao.select();
			for(Emp bean : result) {
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
