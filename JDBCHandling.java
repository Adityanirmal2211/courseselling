import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCHandling {

	
	Connection con;
	PreparedStatement pstmt;
	
	

	JDBCHandling(){



		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Arey bhai Driver mil gaya!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}





		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "9673");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}
	int insertData(String firstname,String lastname,long mobile,String address,String gender,String dob,String Email,String password,String degree) {
		int status=0;




		try {
			pstmt=con.prepareStatement("insert into studenttable values(default,?,?,?,?,?,?,?,?,?)");



			pstmt.setString(1,firstname);
			pstmt.setString(2,lastname);
			pstmt.setLong(3,mobile);
			pstmt.setString(4, address);
			pstmt.setString(5,gender);
			
			pstmt.setString(6,dob);
			pstmt.setString(7,Email);
			pstmt.setString(8,password);
			pstmt.setString(9,degree);



			status=pstmt.executeUpdate();



		} 


		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;




	}
}
