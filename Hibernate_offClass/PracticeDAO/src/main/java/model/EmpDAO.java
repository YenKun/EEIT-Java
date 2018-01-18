package model;

import java.util.List;

import org.hibernate.Session;

public interface EmpDAO {

	Session getSession();

	Emp select(int pk);

	List<Emp> select();

	Emp insert(Emp bean);

	Emp update(Emp bean);

	boolean delete(int pk);

}