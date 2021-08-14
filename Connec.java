package advncJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connec {

	public static void main(String[] args) throws Exception {

		ResourceBundle rsb = ResourceBundle.getBundle("advncJava.app");
		
		Class.forName(rsb.getString("driver"));

		Connection conc = DriverManager.getConnection(rsb.getString("url"), rsb.getString("user"),rsb.getString("pass"));
	 
		Statement smt = conc.createStatement();
		
		int j  = smt.executeUpdate("Delete from student where roll_no = 110");
	
		int v  = smt.executeUpdate("update student set name = 'Danegrous' where roll_no = 107");
		
		int i = smt.executeUpdate("Insert into student values(110,'Nala','sopara','V',15700,'Nepal',13) ");

    	System.out.println(j  + " " +i +" "+ v + "   Updated");
		
		
		
		ResultSet res = smt.executeQuery("select * from student");

		while (res.next()) {

			System.out.print(" " + res.getString(1));
			System.out.print(" " + res.getString(2));
			System.out.print(" " + res.getString(3));
			System.out.print(" " + res.getString(4));
			System.out.print(" " + res.getString(5));
			System.out.print(" " + res.getString(6));
			System.out.println(" " + res.getString(7));
		 //System.out.print(" " + res.getString(8));
		//System.out.println(" " + res.getString(9));

		}

		smt.close();
		conc.close();
	}

}
