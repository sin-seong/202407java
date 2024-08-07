package drive;

import java.util.List;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.getboarList();
		for(BoardDTO dto : list) {
			System.out.println(dto);
		}

	}

}
