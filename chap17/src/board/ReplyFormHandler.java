package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.ArticleListModel;
import mvjsp.chap17.board.service.ListArticleService;

public class ReplyFormHandler implements CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse res) {
		
		return "/WEB-INF/view/reply_form.jsp";
	}

}
