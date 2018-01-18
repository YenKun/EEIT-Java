package model.dao.emp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Emp;
import model.EmpDAO;
import model.dao.EmpDAOHibernate;
import model.hibernate.HibernateUtil;

public class Update {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			EmpDAO dao = new EmpDAOHibernate(session);

			Emp bean = new Emp();
			bean.setEmpid(8);
			bean.setSex('F');
			bean.setEmpname("EEZ");
			bean.setDeptid(20);
			dao.update(bean);

			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}

}
