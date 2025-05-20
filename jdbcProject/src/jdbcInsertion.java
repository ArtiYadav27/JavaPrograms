import java.sql.*;
public class jdbcInsertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/demo";
		String username="root";
		String pass="root";
		String Query="insert into login values('arti','yadav')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,username,pass);
		Statement st=con.createStatement();
		int rs=st.executeUpdate(Query);
		st.close();
		con.close();
	}

}
