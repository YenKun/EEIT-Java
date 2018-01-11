package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.CustomerBean;

public class CustomerDAOjdbc {
	
	private static final String URL = "jdbc:sqlserver://localhost:1433;database=java";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "passw0rd";
	
	private static final String SELECT_BY_ID = "select * from customer where custid=?";
	public CustomerBean select(String custid) throws Exception {
		CustomerBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(SELECT_BY_ID);
		stmt.setString(1, custid);
		rs = stmt.executeQuery();
		if(rs.next()) {
			result = new CustomerBean();
			result.setCustid(rs.getString("custid"));
			result.setPassword(rs.getBytes("password"));
			result.setEmail(rs.getString("email"));
			result.setBirth(rs.getDate("birth"));
		}else {
			result = null;
		}
		rs.close();
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String SELECT_ALL = "select * from customer";
	public List<CustomerBean> select() throws Exception {
		List<CustomerBean> result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		CustomerBean item = null;
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(SELECT_ALL);
		rs = stmt.executeQuery();
		result = new ArrayList<>();
		while(rs.next()){
			item = new CustomerBean();
			item.setCustid(rs.getString("custid"));
			item.setPassword(rs.getBytes("password"));
			item.setEmail(rs.getString("email"));
			item.setBirth(rs.getDate("birth"));
			result.add(item);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String INSERT =
			"insert into customer (custid, password, email, birth) values (?, ?, ?, ?, ?)";
	public CustomerBean insert(CustomerBean bean) throws Exception {
		CustomerBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(INSERT);
		
		stmt.setString(1, bean.getCustid());
		stmt.setBytes(2, bean.getPassword());
		stmt.setString(3, bean.getEmail());
		
		java.util.Date temp = bean.getBirth();
		if (temp != null) {
			java.sql.Date someTime = new java.sql.Date(temp.getTime());
			stmt.setDate(4, someTime);
		} else {
			stmt.setDate(4, null);
		}
		
		stmt.executeUpdate();
		
		int i = stmt.executeUpdate();
		if (i == 1) {
			result = this.select(bean.getCustid());
		}
		
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String UPDATE =
			"update customer set password=?, email=?, birth=? where custid=?";
	public CustomerBean update(byte[] password,
			String email, java.util.Date birth, String custid) throws Exception {
		CustomerBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(UPDATE);
		
		stmt.setBytes(1, password);
		stmt.setString(2, email);
		stmt.setString(4, custid);
		
		java.util.Date temp = birth;
		if (temp != null) {
			java.sql.Date someTime = new java.sql.Date(temp.getTime());
			stmt.setDate(3, someTime);
		} else {
			stmt.setDate(3, null);
		}
		
		stmt.executeUpdate();
		
		int i = stmt.executeUpdate();
		if (i == 1) {
			result = this.select(custid);
		}
		
		stmt.close();
		conn.close();

		return result;
	}
	
	private static final String DELETE = "delete from customer where custid=?";
	public boolean delete(String custid) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(DELETE);
		stmt.setString(1, custid);
		stmt.executeUpdate();
		
		stmt.close();
		conn.close();
		
		return false;
	}

}
