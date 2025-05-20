package com.resuming.web.dao;
import java.sql.*;
import com.resuming.web.model.Student;

public class StudentDao {
	public Student getStudent(int id) {
		Student s=new Student();
		/*
		 * s.setStd_id(1); s.setStd_name("arti");
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Student where std_id="+id);
			if(rs.next()) {
				s.setStd_id(rs.getInt(1));
				s.setStd_name(rs.getString(2));
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return s;
	}
}
