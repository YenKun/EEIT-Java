package oop.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testBufferedReaderIOEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/temp/test/source.txt"));

		/*
		 * = FileReader fr = new FileReader(c:/temp/test/source.txt);
		 * 
		 * BufferedReader br = new BufferedReader(fr);
		 */

		String data;

		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();

	}

}
