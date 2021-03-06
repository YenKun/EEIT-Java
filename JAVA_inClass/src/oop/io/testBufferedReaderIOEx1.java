package oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testBufferedReaderIOEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/temp/test/source.txt"));

		/*
		 * = FileReader fr = new FileReader(c:/temp/test/source.txt);
		 * 
		 * BufferedReader br = new BufferedReader(fr);
		 */

		BufferedWriter bw = new BufferedWriter(new FileWriter("c:/temp/test/myBuffer.txt"));

		/*
		 * = FileWriter fw = new FileWriter(c:/temp/test/myBuffer.txt);
		 * 
		 * BufferedReader bw = new BufferedReader(fw);
		 */

		String data;

		while ((data = br.readLine()) != null) {
			System.out.println(data);
			bw.write(data);
			bw.newLine();
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
