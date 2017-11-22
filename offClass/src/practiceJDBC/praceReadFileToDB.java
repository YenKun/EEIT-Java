package practiceJDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class praceReadFileToDB {

	public static void main(String[] args) throws IOException, SQLException {
		FileInputStream fr = new FileInputStream("res/employee.txt");

		String s = "";
		int data;
		while ((data = fr.read()) != -1) {
			s = s + ((char) data);
		}
		s = s.trim();
		// in txt file change to another row > \r\n
		String[] s1 = s.split("\r\n");
		System.out.println(s1.length);
		int i = 1;
		for (String k : s1) {
			System.out.println(k + ": " + i);
			i++;
		}
		fr.close();

		String conURL = "jdbc:sqlserver://localhost:1433;databaseName=JDBC";
		Connection conn = DriverManager.getConnection(conURL, "sa", "passw0rd");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO emp VALUES (?,?,?,?,?,?)");

		for (int j = 1; j < s1.length; j++) {
			String[] res = s1[j].split(",");
			for (int h = 0; h < res.length; h++) {
				ps.setString(h + 1, res[h]);
			}
			ps.addBatch();
		}
		ps.executeBatch();

	}

}
