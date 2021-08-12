package advncJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredFunctionn {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection  conec = DriverManager.getConnection("jdbc:mysql://localhost/random","root","root");
		
		CallableStatement cos = conec.prepareCall("{?=CALL StuFunc() }");
		cos.registerOutParameter(1,Types.INTEGER);
		
		cos.execute();
		
		System.out.println(" Count is  "+ cos.getInt(1));

		
	}

}
