package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.ReplyArticleService;
import mvjsp.chap17.board.service.ReplyingRequest;

public class ReplyHandler implements CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse res) {
		String viewPage = null;
		String writerName = request.getParameter("writerName");
		String title = request.getParameter("title");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		ReplyingRequest replyingRequest =new ReplyingRequest(writerName, title, password, content);
		try {
			Article postedArticle = ReplyArticleService.getInstance().
					reply(replyingRequest);
			request.setAttribute("postedArticle", postedArticle);
			viewPage = "/reply_success.jsp";
		} catch(Exception ex) {
			viewPage = "/reply_error.jsp";
			request.setAttribute("replyException", ex);
		}
		return "/WEB-INF/view/reply_success.jsp";
	}

	}
	

