package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;

@WebServlet("/page/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("b");
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String bookn = request.getParameter("txtbookn");
		String author = request.getParameter("txtauthor");
		String pub=request.getParameter("txtpub");
		String sort = request.getParameter("txtsort");
		String intr = request.getParameter("txtintr");
		float price =Float.parseFloat(request.getParameter("txtprice"));
		int stock = Integer.parseInt(request.getParameter("txtstock"));
		
		Book book = new Book();
		book.setbookn(bookn);
		book.setauthor(author);
		book.setpub(pub);
		book.setsort(sort);
		book.setintr(intr);
		book.setprice(price);
		book.setstock(stock);
		
		BookService bs = new BookService();
		bs.addBook(book);
		response.sendRedirect("addBookSuccess.html");
	}

}
