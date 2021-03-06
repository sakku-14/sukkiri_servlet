package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		
		//リクエストパラメータをチェック
		String errorMsg = "";
		if (name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if (sex == null || sex.length() == 0) {
			errorMsg += "性別が選択されていません<br>";
		} else {
			if (sex.equals("0")) { sex = "男性"; }
			else if (sex.equals("1")) { sex = "女性"; }
		}
		
		//表示するメッセージを設定
		String msg = name + "さん(" + sex + ")を登録しました";
		if (errorMsg.length() != 0) {
			msg = errorMsg;
		}
		
		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");

		
	}

}
