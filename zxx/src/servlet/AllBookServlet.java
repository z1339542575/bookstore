package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;

@WebServlet("/AllBookServlet")
public class AllBookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("~~~~~~~1~~~~~~~~~~");
		BookService bs = new BookService();
		List<Book> list = bs.queryBook();
		request.getSession().setAttribute("BookList", list);
		response.sendRedirect("page/bookList.jsp");
	}

}
