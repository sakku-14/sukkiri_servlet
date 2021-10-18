package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		double height;
		double weight;
		try {
			height = Double.parseDouble(request.getParameter("height"));
			weight = Double.parseDouble(request.getParameter("weight"));
			if (height <= 0 || weight <= 0) {
				throw new NumberFormatException("height/weightの値が不正です");
			}
			Health h = new Health(height, weight);
			HealthCheckLogic.calcBmi(h);
			HealthCheckLogic.setBodyStyle(h);

			request.setAttribute("health", h);
		} catch (NumberFormatException e) {
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
			d.forward(request, response);
			System.err.println(e);
			System.err.println("height/weightの値が入力されていません");
		}
		
		
		// フォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		d.forward(request, response);
		
	}

}
