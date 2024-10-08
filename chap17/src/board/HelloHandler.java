package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;

public class HelloHandler implements CommandHandler {

	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("hello", "안녕하세요!");
		return "/WEB-INF/view/hello.jsp";
	}

}
