package advncJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoreProcedureInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		CallableStatement cs = conn.prepareCall(" {CALL InsertIn(?,?,?,?,?,?,?) }");
		
		
		cs.setInt(1, 117);
		cs.setString(2, "Chhole");
		cs.setString(3, "Bhature");
		cs.setString(4, "V");
		cs.setInt(5,5000);
        cs.setString(6, "Naigra");
		cs.setInt(7,12);
		
		cs.executeUpdate();


		System.out.println("Inseerted " );

	}

}
