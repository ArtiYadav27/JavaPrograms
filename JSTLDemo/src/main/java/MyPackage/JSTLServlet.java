package MyPackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		//String name="Arti";
		//req.setAttribute("label",name);
		
		//Student s=new Student(1,"arti");
		//req.setAttribute("student",s);
		
		List<Student> studs=Arrays.asList(new Student(1,"Arti"), new Student(2,"paak"),new Student(3,"semi"));
		req.setAttribute("students",studs);
		
		
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
