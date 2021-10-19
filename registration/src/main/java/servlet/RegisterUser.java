package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action == null) {
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/registerForm.jsp");
			d.forward(request, response);
		} else if (action.equals("done")) {
			HttpSession session = request.getSession();
			User u = (User) session.getAttribute("user");
			RegisterUserLogic rul = new RegisterUserLogic(u);
			rul.exec();
		}
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/registerDone.jsp");
		d.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		
		User user = new User(id, pass, name);

		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		RequestDispatcher d = request.getRequestDispatcher("WEB-INF/registerConfirm.jsp");
		d.forward(request, response);
	}

}
