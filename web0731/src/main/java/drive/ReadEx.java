package drive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx {

	public static void main(String[] args) throws IOException {
//		FileReader reader = new FileReader("C:/Temp/test7.txt");
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv"));
		//보조 스트림
		
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			BoardDAO dao = new BoardDAO();
			
			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			System.out.println(dto);
//			dao.insertBoard(dto);
//			System.out.println("insert연결");
				
//			for (String element : data) {
//				System.out.println(element + " ");
//			}
//			System.out.println();
			
		}
		br.close();
		

	}

}
