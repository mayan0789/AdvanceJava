package javaBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;

public class MarksheetModel {

	public int nextPK() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		int pk = 0;
		
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" select max(id) from marksheet");

		ResultSet ro = ps.executeQuery();
		while (ro.next()) {
			pk = ro.getInt(1);
		}
		return pk + 1;
	}

	public void add(Marksheet msbean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conc = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		conc.setAutoCommit(false);

		PreparedStatement ps = (PreparedStatement) conc
				.prepareStatement(" insert into marksheet values(?,?,?,?,?,?,?)");

		ps.setInt(1, nextPK());
		ps.setString(2, msbean.getRollNo());
		ps.setString(3, msbean.getFname());
		ps.setString(4, msbean.getLname());
		ps.setInt(5, msbean.getPhy());
		ps.setInt(6, msbean.getChem());
		ps.setInt(7, msbean.getMath());

		ps.executeUpdate();

		conc.commit();

		System.out.println("Added Successfully");

		ps.close();
		conc.close();

	}

	public void update(Marksheet msbean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(
				" Update Marksheet set rollno =?, fname = ?, lname = ?,physics = ?, chemistry = ?, Maths =?  where id = ?");

		ps.setString(1, msbean.getRollNo());
		ps.setString(2, msbean.getFname());
		ps.setString(3, msbean.getLname());
		ps.setInt(4, msbean.getPhy());
		ps.setInt(5, msbean.getChem());
		ps.setInt(6, msbean.getMath());
		ps.setInt(7, msbean.getId());

		ps.executeUpdate();

		conn.commit();
		System.out.println("Updated Successfully");

		ps.close();
		conn.close();
	}

	public void delete(Marksheet msbean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Delete From marksheet where id = ?");

		ps.setInt(1, msbean.getId());

		ps.executeUpdate();
		System.out.println("Deleted Successfully");

		ps.close();
		conn.close();
	}

	public void search(Marksheet msbean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Select * from marksheet");

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

	public void get(Marksheet msbean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(" Select * from marksheet where id = ?");

		ps.setInt(1, msbean.getId());

		ResultSet rs = ps.executeQuery();

		System.out.println("---------------Full List --------------------");
		
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

	public List<Marksheet> getMeritList() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/random", "root", "root");

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(
				" SELECT *,(physics+chemistry+maths) AS total,(physics+chemistry+maths)/3 AS Percent FROM marksheet WHERE Physics>40 and Chemistry>40 and Maths>40 ORDER BY total LIMIT 8");

		ResultSet rs = ps.executeQuery();
		Marksheet msbean = null;
		
		
		ArrayList<Marksheet> list1 = new ArrayList<Marksheet>();

		while (rs.next()) {
			msbean = new Marksheet();
			msbean.setId(rs.getInt(1));
			msbean.setRollNo(rs.getString(2));
			msbean.setFname(rs.getString(3));
			msbean.setLname(rs.getString(4));
			msbean.setPhy(rs.getInt(5));
			msbean.setChem(rs.getInt(6));
			msbean.setMath(rs.getInt(7));
		
			list1.add(msbean);
	
		}
  
		ps.close();
		conn.close();
		return list1;
	}
}
