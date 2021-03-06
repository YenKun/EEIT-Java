package oop.io;

import java.io.File;
import java.io.IOException;

public class testFileOperationEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/hello.txt");
		boolean status = file1.exists();
		System.out.println("status:" + status);
		if (status) {
			String name = file1.getName();
			long length = file1.length();
			String parent = file1.getParent();
			String path = file1.getPath();

			System.out.println("Name:" + name);
			System.out.println("Parent:" + parent);
			System.out.println("Path:" + path);
			System.out.println("Length:" + length);

			file1.delete();
			System.out.println("File Deleted");

		} else {
			file1.mkdirs();
			file1.createNewFile();
			System.out.println("File Created");
		}

	}

}
