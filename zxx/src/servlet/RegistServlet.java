package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("a");
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String bname = request.getParameter("txtbname");
		String pwd = request.getParameter("txtpwd");
		String mail=request.getParameter("txtmail");
		String phone = request.getParameter("txtphone");
		String address = request.getParameter("txtaddress");
		
		User user = new User();
		user.setbname(bname);
		user.setpwd(pwd);
		user.setmail(mail);
		user.setphone(phone);
		user.setaddress(address);
		user.settype(0);
		
		UserService us = new UserService();
		us.addUser(user);
		response.sendRedirect("RegistSuccess.html");
	}

}
