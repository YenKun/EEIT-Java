package practiceJDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class pracBlob {

	public static void main(String[] args) throws SQLException, IOException {

		String input = args[0];
		String output = args[1];

		String conURL = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		Connection conn = DriverManager.getConnection(conURL, "sa", "passw0rd");
		PreparedStatement ps = conn.prepareStatement("SELECT * From blobtest");
		ResultSet rs = ps.executeQuery();
		
		//delete data from the table if it already exists
		
		if (rs.next()) {
			ps = conn.prepareStatement("DELETE FROM blobtest where name =?");
			ps.setString(1, input);
			ps.executeUpdate();
			System.out.println("DELETE SUCCEED");
		}
		
		//insert the image into table
		
		ps = conn.prepareStatement("INSERT INTO blobtest Values(?,?)");
		File f = new File(input);
		FileInputStream fis = new FileInputStream(f);
		ps.setString(1, input);
		ps.setBinaryStream(2, fis, f.length());
		int k = ps.executeUpdate();
		System.out.println("Insert Succeed: " + k);
		
		//get the image from the table 
		
		ps = conn.prepareStatement("Select * from blobtest");
		rs = ps.executeQuery();
		if (rs.next()) {
			FileOutputStream fos = new FileOutputStream(output);
			Blob b = rs.getBlob(2);
			
			//Blob.getBytes(long pos, int length)
			//pos start with 1 
			//length's type is integer while Blob.length() return type is long
			byte data[] = b.getBytes(1, (int) b.length());
			
			//FileOutputStream.write(byte[] b, int off, int len)
			//off means offset and start with 0
			//len's type is integer while Blob.length() return type is long
			fos.write(data, 0, (int) b.length());
			
			
			fos.close();
			fis.close();
		}
		
		InputStream fis2 = rs.getBinaryStream(2);
		FileOutputStream fos2 = new FileOutputStream("E:/new.gif");
		int data;
		while((data=fis2.read())!=-1) {
			fos2.write(data);
		}

		fos2.close();
		fis2.close();

	}

}
