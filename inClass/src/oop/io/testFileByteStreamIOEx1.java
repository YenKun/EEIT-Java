package oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testFileByteStreamIOEx1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("c:/temp/test/source.txt");
		FileOutputStream fos = new FileOutputStream("c:/temp/test/destination.txt");
		int data;

		while ((data = fis.read()) != -1) {
			System.out.print((char) data);
			fos.write(data);
		}
		fos.close();
		fis.close();

	}

}
