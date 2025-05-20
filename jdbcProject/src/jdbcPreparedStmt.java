import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPreparedStmt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/demo";
		String username="root";
		String pass="root";
		String uname="shubham";
		String upass="pandey";
		String Query="insert into login values(?,?)";
		String Query2="select * from login where name=? and pass=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,username,pass);
		PreparedStatement st=con.prepareStatement(Query2);
		st.setString(1,uname);
		st.setString(2, upass);
//		int rs=st.executeUpdate();
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1) +rs.getString(2));
		}
		st.close();
		con.close();
	}
}
