package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex2 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(1, "김김기", "누군가의 글귀", "누군가의 발자취", "", 0);
		dao.updateBoard(dto);
		System.out.println("입력성공");
	}

}
