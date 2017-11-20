package oop.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFileCharStreamIOEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:/temp/test/source.txt");
		FileWriter fw = new FileWriter("c:/temp/test/myFile.txt");

		int data;

		while ((data = fr.read()) != -1) {
			System.out.print((char) data);
			fw.write(data);
		}
		fw.close();
		fr.close();

	}

}