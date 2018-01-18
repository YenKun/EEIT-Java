package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.Customer;
import model.CustomerDAO;

public class CustomerDAOHibernate implements CustomerDAO {
	private Session session = null;

	public CustomerDAOHibernate(Session session) {
		this.session = session;
	}

	@Override
	public Session getSession() {
		return session;
	}

	private static final String SELECT_BY_ID = "FROM Customer where custid = ?";

	@Override
	public Customer select(String pk) {
		Customer result = null;
		if (session != null) {
			Query<Customer> query = session.createQuery(SELECT_BY_ID, Customer.class);
			if (query != null) {
				query.setParameter(0, pk);
				result = query.uniqueResult();
			}
		}
		return result;
	}

	private static final String SELECT_ALL = "FROM Customer";

	@Override
	public List<Customer> select() {
		List<Customer> result = null;

		if (session != null) {
			Query<Customer> query = session.createQuery(SELECT_ALL, Customer.class);
			if (query != null) {
				result = query.list();
			}
		}
		return result;
	}

	@Override
	public Customer insert(Customer bean) {
		Customer result = null;
		if (session != null) {
			result = session.get(Customer.class, bean.getCustid());
			if (result == null) {
				session.save(bean);
			}
		}
		return result;
	}

	@Override
	public Customer update(Customer bean) {
		Customer result = null;
		if (session != null) {
			Customer temp = session.get(Customer.class, bean.getCustid());
			if (temp != null) {
				temp.setBirth(bean.getBirth());
				temp.setEmail(bean.getEmail());
				temp.setPassword(bean.getPassword());
				result = bean;
			}
		}
		return result;
	}

	@Override
	public boolean delete(String pk) {
		if (session != null) {
			Customer temp = session.get(Customer.class, pk);
			if (temp != null) {
				session.delete(temp);
				return true;
			}
		}
		return false;
	}

}
