package model;

import java.util.List;

import org.hibernate.Session;

public interface CustomerDAO {

	Session getSession();

	Customer select(String pk);

	List<Customer> select();

	Customer insert(Customer bean);

	Customer update(Customer bean);

	boolean delete(String pk);

}