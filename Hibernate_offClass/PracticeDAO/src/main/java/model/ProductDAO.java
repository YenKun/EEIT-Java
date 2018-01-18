package model;

import java.util.List;

import org.hibernate.Session;

public interface ProductDAO {

	Session getSession();

	List<Product> select();

	Product select(int pk);

	Product insert(Product bean);

	Product update(Product bean);

	boolean delete(int pk);

}