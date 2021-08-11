package advncJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class TestingSql {

	public static void main(String[] args) throws Exception {

		//testUpdate();
		// testDelete();
		//testAdd();
		//testSelect();
		testGet(103);

	}

	public static void testGet(int i) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Select * from Student where roll_no = ?");

		ps.setInt(1, i);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
		System.out.print(" " + rs.getString(1));
		System.out.print(" " + rs.getString(2));
		System.out.print(" " + rs.getString(3));
		System.out.print(" " + rs.getString(4));
		System.out.print(" " + rs.getString(5));
		System.out.print(" " + rs.getString(6));
		System.out.println(" " + rs.getString(7));
		}
	 conn.close();
	
	}

	public static void testSelect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Select * from Student");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(" " + rs.getString(1));
			System.out.print(" " + rs.getString(2));
			System.out.print(" " + rs.getString(3));
			System.out.print(" " + rs.getString(4));
			System.out.print(" " + rs.getString(5));
			System.out.print(" " + rs.getString(6));
			System.out.println(" " + rs.getString(7));
		}

		ps.close();
		conn.close();

	}

	public static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		int d = 110;

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Delete From Student where roll_no = ?");

		ps.setInt(1, d);
		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public static void testUpdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		int d = 103;
		String m = "Palwan";
		String n = "Panama";
		PreparedStatement ps = (PreparedStatement) conn
				.prepareStatement(" Update Student set name = ?, city = ?  where roll_no = ?");

		ps.setString(1, m);
		ps.setString(2, n);
		ps.setInt(3, d);
		ps.executeUpdate();

		ps.close();
		conn.close();

	}

	public static void testAdd() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		int d = 110;
		String m = "Kala";
		String n = "Naala";
		String b = "II";
		int s = 16000;
		String v = "Guahati ";
		int f = 11;

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" insert into Student values(?,?,?,?,?,?,?)");

		ps.setString(2, m);
		ps.setString(3, n);
		ps.setInt(1, d);
		ps.setString(4, b);
		ps.setInt(5, s);
		ps.setString(6, v);
		ps.setInt(7, f);

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

}
