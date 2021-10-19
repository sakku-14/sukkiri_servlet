package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class MinatoIndex
 */
@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		ServletContext application = this.getServletContext();
		SiteEV sev = (SiteEV) application.getAttribute("sev");
		if (sev == null) {
			sev = new SiteEV(0, 0);
		}
		
		SiteEVLogic sevLogic = new SiteEVLogic(sev);
		
		if (action != null) {
			if (action.equals("like")) {
				sevLogic.incEV(1);
			} else if (action.equals("dislike")) {
				sevLogic.incEV(0);
			}			
		}
		application.setAttribute("sev", sev);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/minatoIndex.jsp");
		dispatcher.forward(request, response);
	}

}
