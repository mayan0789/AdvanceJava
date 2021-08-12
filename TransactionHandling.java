package advncJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conec = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		conec.setAutoCommit(false);
				
		Statement smt = conec.createStatement();
		
		smt.executeUpdate("Insert into student values(111,'Laal','Kaala','IIV',8000,'China',11) ");
		
		smt.executeUpdate("Insert into student values(111,'Laal','Kaala','IIV',8000,'China',11) ");
		
		smt.executeUpdate("Insert into student values(111,'Laal','Kaala','IIV',8000,'China',11) ");
		
		conec.commit();

		smt.close();
		conec.close();
	}

}
