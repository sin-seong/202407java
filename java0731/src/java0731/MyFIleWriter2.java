package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFIleWriter2 {
	//p663
	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/file");
//		File file1 = new File("C:/Temp/text/file1.txt");

		if(dir.exists() ==false) {
			dir.mkdir();
			}

		
		Writer writer = new FileWriter("C:/Temp/file/data.txt");
		String str = "뚜 안 빠라빠라라라";
		writer.write(str);
		writer.	flush();
		writer.close();
	}
		}
	