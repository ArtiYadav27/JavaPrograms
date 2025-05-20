package com.Login.Dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao {
	
	String url="jdbc:mysql://localhost:3306/demo";
	String username="root";
	String password="root";
	String sql="select * from login where name=? and pass=?";
	
	public boolean check(String name,String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2,pass);
			ResultSet rs=st.executeQuery();			  
			if(rs.next()) { return true; }
 
		} 
		catch (Exception e) {
			e.printStackTrace(); 
		}	
		return false;
	}
}
