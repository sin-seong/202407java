package dirve;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		BoardDTO dto = new BoardDTO(28, "가감승", "감씨글제목", "감씨끌귀", null, 0);
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(dto);

	}

}
