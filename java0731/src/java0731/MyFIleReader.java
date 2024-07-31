package java0731;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFIleReader {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/text/file2.txt");
		
		char[] buffer = new char[150];
		
		int readNum = reader.read(buffer);
		if(readNum != -1) {
			for (char ch : buffer) {
				System.out.println(ch);
			}
			System.out.println();
		}
		reader.close();
	}

}
