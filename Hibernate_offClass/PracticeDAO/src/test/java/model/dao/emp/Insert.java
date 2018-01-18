package model.dao.emp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Emp;
import model.EmpDAO;
import model.dao.EmpDAOHibernate;
import model.hibernate.HibernateUtil;

public class Insert {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			EmpDAO dao = new EmpDAOHibernate(session);
			
			Emp bean = new Emp();
			bean.setSalary(16000);
			bean.setDeptid(30);
			System.out.println(dao.insert(bean));
			
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
