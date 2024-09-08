package com.PDatabseEg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PDatabaseUpdate {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/sept2",
				"root", "pass@word1");
 
			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database
			PreparedStatement ps = connection.prepareStatement("update messages set ptype=? where ptype=?");
			ps.setString(1, "I");
			ps.setString(2, "Internal");
			int nrecs = ps.executeUpdate();
			System.out.println("Update "+ nrecs+" successfully");
			ps.setString(1, "E");
			ps.setString(2, "ptype");
			nrecs = ps.executeUpdate();
			System.out.println("Update "+ nrecs+" successfully");
			ps.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends

}
