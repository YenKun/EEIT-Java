package model.dao.product;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Product;
import model.ProductDAO;
import model.dao.ProductDAOHibernate;
import model.hibernate.HibernateUtil;

public class SelectAll {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			ProductDAO dao = new ProductDAOHibernate(session);
			
			List<Product> result= dao.select();
			for(Product bean : result) {
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
