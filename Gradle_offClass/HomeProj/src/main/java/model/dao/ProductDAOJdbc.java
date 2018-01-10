package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ProductBean;

public class ProductDAOJdbc {
	private static final String URL = "jdbc:sqlserver://localhost:1433;database=java";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "passw0rd";

	public static void main(String[] args) {
		
	}
	private static final String SELECT_BY_ID = "select * from product where id=?";
	public ProductBean select(int id) throws Exception {
		ProductBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(SELECT_BY_ID);
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		if(rs.next()) {
			result = new ProductBean();
			result.setId(rs.getInt("id"));
			result.setName(rs.getString("name"));
			result.setPrice(rs.getDouble("price"));
			result.setMake((java.util.Date)rs.getDate("make"));
			result.setExpire(rs.getInt("expire"));
		}else {
			result = null;
		}
		rs.close();
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String SELECT_ALL = "select * from product";
	public List<ProductBean> select() throws Exception {
		List<ProductBean> result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ProductBean item = null;
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(SELECT_ALL);
		rs = stmt.executeQuery();
		result = new ArrayList<>();
		while(rs.next()){
			item = new ProductBean();
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setPrice(rs.getDouble("price"));
			item.setMake((java.util.Date)rs.getDate("make"));
			item.setExpire(rs.getInt("expire"));
			result.add(item);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String INSERT =
			"insert into product (id, name, price, make, expire) values (?, ?, ?, ?, ?)";
	public ProductBean insert(ProductBean bean) throws Exception {
		ProductBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(INSERT);
		
		stmt.setInt(1, bean.getId());
		stmt.setString(2, bean.getName());
		stmt.setDouble(3, bean.getPrice());
		stmt.setInt(5, bean.getExpire());
		
		java.util.Date temp = bean.getMake();
		if (temp != null) {
			java.sql.Date someTime = new java.sql.Date(temp.getTime());
			stmt.setDate(4, someTime);
		} else {
			stmt.setDate(4, null);
		}
		
		stmt.executeUpdate();
		
		int i = stmt.executeUpdate();
		if (i == 1) {
			result = this.select(bean.getId());
		}
		
		stmt.close();
		conn.close();
		
		return result;
	}
	
	private static final String UPDATE =
			"update product set name=?, price=?, make=?, expire=? where id=?";
	public ProductBean update(String name,
			double price, java.util.Date make, int expire, int id) throws Exception {
		ProductBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(UPDATE);
		
		stmt.setString(1, name);
		stmt.setDouble(2, price);
		stmt.setDouble(4, expire);
		stmt.setInt(5, id);
		
		java.util.Date temp = make;
		if (temp != null) {
			java.sql.Date someTime = new java.sql.Date(temp.getTime());
			stmt.setDate(3, someTime);
		} else {
			stmt.setDate(3, null);
		}
		
		stmt.executeUpdate();
		
		int i = stmt.executeUpdate();
		if (i == 1) {
			result = this.select(id);
		}
		
		stmt.close();
		conn.close();

		return result;
	}
	
	private static final String DELETE = "delete from product where id=?";
	public boolean delete(int id) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		stmt = conn.prepareStatement(DELETE);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		
		stmt.close();
		conn.close();
		
		return false;
	}
}
