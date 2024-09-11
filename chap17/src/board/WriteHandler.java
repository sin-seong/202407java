package board;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.IdGenerationFailedException;
import mvjsp.chap17.board.service.WriteArticleService;
import mvjsp.chap17.board.service.WritingRequest;

public class WriteHandler implements CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse res) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String writerName = request.getParameter("writerName");
		String title = request.getParameter("title");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		WritingRequest writingRequest = new WritingRequest(writerName, title, password, content);
		Article postedArticle = null;
		try {
			postedArticle = WriteArticleService.getInstance().write(writingRequest);
			request.setAttribute("postedArticle", postedArticle);
		} catch (IdGenerationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/WEB-INF/view/writeresult.jsp";
	}

}
