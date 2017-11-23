package practiceJDBC;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Quiz2pracExportData {

	public static void main(String args[]) throws SQLException, IOException {

		String table = "employee";
		String conURL = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		Connection conn = DriverManager.getConnection(conURL, "sa", "passw0rd");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM " + table);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmt = rs.getMetaData();
		int count = rsmt.getColumnCount();

		FileWriter fos = new FileWriter("res/" + table + ".txt");
		ArrayList<String> columnName = new ArrayList<String>();
		ArrayList<String> content = new ArrayList<String>();

		for (int i = 1; i <= count; i++) {
			if (i == count) {
				columnName.add(rsmt.getColumnName(i) + "\r\n");
			} else {
				columnName.add(rsmt.getColumnName(i) + ",");
			}
		}

		while (rs.next()) {
			for (int i = 1; i <= count; i++) {
				if (i == count) {
					content.add(rs.getString(i) + "\r\n");
				} else {
					content.add(rs.getString(i) + ",");
				}
			}
		}

		System.out.println(columnName);
		System.out.println(content);

		for (String data : columnName) {
			fos.write(data);
		}

		for (String data : content) {
			fos.write(data);
		}
		fos.close();

	}

}