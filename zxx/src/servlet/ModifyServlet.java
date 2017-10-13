package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet("/page/ModifyServlet")
public class ModifyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User sessionUser = (User) request.getSession().getAttribute("User");
		if (sessionUser == null) {
			response.sendRedirect("Login.html");
		} else {
			request.setCharacterEncoding("utf-8");
			String bname = request.getParameter("txtbname");
			String pwd = request.getParameter("txtPwd");
			String mail = request.getParameter("txtmail");
			String phone = request.getParameter("txtphone");
			String address = request.getParameter("txtaddress");

			User user = new User();
			user.setbname(bname);
			user.setpwd(pwd);
			user.setmail(mail);
			user.setphone(phone);
			user.setaddress(address);
			user.settype(1);

			request.getSession().setAttribute("User", user);

			UserService us = new UserService();
			us.modifyUser(user);
			response.sendRedirect("modifySuccess.html");
		}
	}


}
