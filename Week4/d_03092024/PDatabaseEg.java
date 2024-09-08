package com.PDatabseEg;

import java.sql.*;

public class PDatabaseEg {
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
			
			PreparedStatement ps = connection.prepareStatement
              ("select * from messages where pname like ?");
			
			ps.setString(1, "%name11%");
			ResultSet resultSet;
			resultSet = ps.executeQuery();
			int code;
			String name, msg;
			while (resultSet.next()) {
				code = resultSet.getInt("id");
				name = resultSet.getString("pname").trim();
				msg = resultSet.getString("msg").trim();
				System.out.println("Code : " + code
								+ " Name : " + name+" Message: "+msg);
			}
			resultSet.close();
			ps.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
}
