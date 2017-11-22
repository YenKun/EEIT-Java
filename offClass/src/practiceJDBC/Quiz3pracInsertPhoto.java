package practiceJDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Quiz3pracInsertPhoto {

	public static void main(String[] args) throws SQLException, IOException {
		String conURL = "jdbc:sqlserver://localhost:1433;databaseName=JDBC";
		Connection conn = DriverManager.getConnection(conURL, "sa", "passw0rd");
		
		//use to get count of the data in order to put all empno into an array
		PreparedStatement getCount = conn.prepareStatement("SELECT count(empno) as count FROM employee");
		PreparedStatement getID = conn.prepareStatement("SELECT empno FROM employee");
		PreparedStatement ps = conn.prepareStatement("UPDATE employee SET photo=? WHERE empno=?");
		ResultSet rs = getCount.executeQuery();
		ResultSet rsID = getID.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt("count");
		}
		int[] ID = new int[count];

		while (rsID.next()) {
			//put all empno into ID[]
			ID[rsID.getRow() - 1] = rsID.getInt(1);
		}

		
		//Insert the photo
		for (int i = 0; i < count; i++) {
			File f = new File("res/" + ID[i] + ".gif");
			FileInputStream fis = new FileInputStream(f);
			ps.setBinaryStream(1, fis, f.length());
			ps.setInt(2, ID[i]);
			ps.addBatch();
			System.out.println(ID[i] + "ADDED");
		}
		ps.executeBatch();
		


	}

}
