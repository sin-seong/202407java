package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.service.DeleteArticleService;
import mvjsp.chap17.board.service.DeleteRequest;

public class DeleteHandler implements CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse res) {
		String viewPage = null;
		String articleId = request.getParameter("articleId");
		String password = request.getParameter("password");
		DeleteRequest deleteRequest = new DeleteRequest(Integer.parseInt(articleId), password);
		try {
			DeleteArticleService.getInstance().deleteArticle(deleteRequest);
			viewPage = "/WEB-INF/view/delete_success.jsp";
		} catch (Exception ex) {
			request.setAttribute("deleteException", ex);
			viewPage = "/WEB-INF/view/delete_error.jsp";
		}
		return viewPage;
	}

}
