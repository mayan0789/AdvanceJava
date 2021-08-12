package advncJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedure {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		CallableStatement cs = conn.prepareCall(" {CALL StuCount(?) }");
		cs.registerOutParameter(1, Types.INTEGER);
		
		cs.execute();
		int con = cs.getInt(1);

		System.out.println("Count  is " + con);

	}

}
