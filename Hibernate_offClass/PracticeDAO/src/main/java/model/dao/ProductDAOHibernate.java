package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.Product;
import model.ProductDAO;

public class ProductDAOHibernate implements ProductDAO {
	private Session session = null;

	@Override
	public Session getSession() {
		return this.session;
	}

	public ProductDAOHibernate(Session session) {
		this.session = session;
	}

	private static final String SELECT_ALL = "FROM Product";

	@Override
	public List<Product> select() {
		List<Product> result = null;
		if (session != null) {
			Query<Product> query = session.createQuery(SELECT_ALL, Product.class);
			if (query != null) {
				result = query.list();
			}
		}

		return result;
	}

	private static final String SELECT_BY_ID = "FROM Product WHERE id=?";

	@Override
	public Product select(int pk) {
		Product result = null;
		if (session != null) {
			Query<Product> query = session.createQuery(SELECT_BY_ID, Product.class);
			if (query != null) {
				query.setParameter(0, pk);
				result = query.uniqueResult();
			}
		}
		return result;
	}

	@Override
	public Product insert(Product bean) {
		Product result = null;
		if (session != null) {
			if (session.get(Product.class, bean.getId()) == null) {
				session.save(bean);
				result = bean;
			}
		}

		return result;
	}

	@Override
	public Product update(Product bean) {
		Product result = null;
		if (session != null) {
			Product temp = session.get(Product.class, bean.getId());
			if (temp != null) {
				temp.setExpire(bean.getExpire());
				temp.setMake(bean.getMake());
				temp.setName(bean.getName());
				temp.setPrice(bean.getPrice());
				result = temp;
			}
		}

		return result;
	}

	@Override
	public boolean delete(int pk) {
		if (session != null) {
			Product temp = session.get(Product.class, pk);
			if (temp != null) {
				session.delete(temp);
				return true;
			}
		}
		return false;
	}

}
