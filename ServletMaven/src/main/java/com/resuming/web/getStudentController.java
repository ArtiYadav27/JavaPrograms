package com.resuming.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resuming.web.dao.StudentDao;
import com.resuming.web.model.Student;

public class getStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("a_id"));
		StudentDao dao=new StudentDao();
		Student s1=dao.getStudent(id);
		
		/*using RequestDispatcher
		 * request.setAttribute("student", s1); RequestDispatcher
		 * rd=request.getRequestDispatcher("showStudent.jsp");
		 * rd.forward(request,response);
		 */
		
		//using sendRedirect
		
		HttpSession session=request.getSession();
		session.setAttribute("student",s1);
		response.sendRedirect("showStudent.jsp");
	}
}
