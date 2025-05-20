package MyPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlServletSql")
public class JstlServletSql extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		
		//RequestDispatcher rd=req.getRequestDispatcher("displaySql.jsp");
		RequestDispatcher rd=req.getRequestDispatcher("displayFunc.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

