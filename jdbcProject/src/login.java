import java.sql.*;
public class login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/demo";
		String username="root";
		String pass="root";
		String Query="select * from login";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,username,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println(rs.getString(1)  +rs.getString(2));
		}
		st.close();
		con.close();
	}

}
