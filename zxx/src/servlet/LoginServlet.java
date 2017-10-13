package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.UserService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("a");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("~~~~~~~1~~~~~~~~~~");
		UserService us = new UserService();
		String bname = request.getParameter("txtbname");
		String pwd = request.getParameter("txtpwd");
		User u = us.loginCheck(bname, pwd);
		if(u == null){
			//µÇÂ¼Ê§°Ü
			response.sendRedirect("page/LoginFail.html");
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("User", u);
			if(u.gettype()==1){
				response.sendRedirect("page/main_admin.html");
			}else{
				response.sendRedirect("page/main_user.jsp");
			}

			//µÇÂ¼³É¹¦
		}
	}

}
