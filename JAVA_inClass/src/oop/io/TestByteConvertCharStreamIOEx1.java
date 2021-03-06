package oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/Secret.txt" ,true)));

		System.out.println("Plz Type In Ur Name:(Press Q or q to exit)");

		String data;

		while ((data = br.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				System.out.println("System Closed");
				bw.flush();

				bw.close();
				br.close();
				System.exit(-1);

			} else {
				System.out.println(data + " : " + new Date());
				bw.write(data + " : " + new Date());
				bw.newLine();
			}
		}

	}

}
