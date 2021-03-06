package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int visitors = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//運勢をランダムで取得
		String[] luckArray = {"大吉", "小吉", "凶"};
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];
		
		//実行日を取得
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);
		
		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		visitors++;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + today + "の運勢は、「" + luck + "」です</p>");
		out.println("<p>" + visitors + "番目の訪問者です</p>");
		out.println("<ol>");
		out.println("<li>サーブレット</li>");
		out.println("<li>eclipse</li>");
		out.println("<li>JSP</li>");
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}