package javacourse.NewJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uName = "postgres";
		String pass = "Marvel@331531$";
		String sql = "select * from student";
		
		
		
		int sid =13;
		String sname="Swayam";
		int marks =66;
		
		String insert = "insert into student values(?,?,?)";
		String update ="update student set sname='Pavan' where sid=8";
	
		
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		System.out.println("Connect is successfully established");
		
		PreparedStatement st = con.prepareStatement(insert);
		
		//st.execute(insert);
		//st.execute(update);
		
		st.setInt(1, sid);
		st.setString(2, sname);
		st.setInt(3, marks);
		
		st.execute();
//		
//		while(rs.next())
//		{
//			System.out.print(rs.getInt(1) + " - ");
//			System.out.print(rs.getString(2) + " - ");
//			System.out.println(rs.getInt(3));
//			
//		}
		
		
		
		con.close();
		System.out.println("Connection is closed");
	}

}
