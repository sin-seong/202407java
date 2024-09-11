package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.ArticleNotFoundException;
import mvjsp.chap17.board.service.ReadArticleService;

public class ReadHandler implements CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse res) {
		int articleId = Integer.parseInt(request.getParameter("articleId"));
		String viewPage = null;
		try {
			Article article = ReadArticleService.getInsteance().readArticle(articleId);
			request.setAttribute("article", article);
			
		} catch(ArticleNotFoundException ex) {
			
		}
		return "/WEB-INF/view/read_view.jsp";
	}

}
