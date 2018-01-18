package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.Emp;
import model.EmpDAO;

public class EmpDAOHibernate implements EmpDAO {
	private Session session;

	public EmpDAOHibernate(Session session) {
		this.session = session;
	}

	@Override
	public Session getSession() {
		return session;
	}

	private static final String SELECT_BY_ID = "FROM Emp WHERE empid=?";

	@Override
	public Emp select(int pk) {
		Emp result = null;
		if (session != null) {
			Query<Emp> query = session.createQuery(SELECT_BY_ID, Emp.class);
			if (query != null) {
				query.setParameter(0, pk);
				result = query.uniqueResult();
			}
		}
		return result;
	}

	private static final String SELECT_ALL = "FROM Emp";

	@Override
	public List<Emp> select() {
		List<Emp> result = null;
		if (session != null) {
			Query<Emp> query = session.createQuery(SELECT_ALL, Emp.class);
			if (query != null) {
				result = query.list();
			}
		}
		return result;
	}

	@Override
	public Emp insert(Emp bean) {
		Emp result = null;
		if (session != null) {
			result = session.get(Emp.class, session.save(bean));
		}
		return result;
	}

	@Override
	public Emp update(Emp bean) {
		Emp result = null;
		if (session != null) {
			Emp temp = session.get(Emp.class, bean.getEmpid());
			temp.setDeptid(bean.getDeptid());
			temp.setEmpname(bean.getEmpname());
			temp.setPhoto(bean.getPhoto());
			temp.setSalary(bean.getSalary());
			temp.setSex(bean.getSex());
			result = temp;
		}
		return result;
	}

	@Override
	public boolean delete(int pk) {
		if (session != null) {
			Emp temp = session.get(Emp.class, pk);
			if (temp != null) {
				session.delete(temp);
				return true;
			}
		}
		return false;
	}
}
