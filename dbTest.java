/**
 * ConnectSQLite.java
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author www.javaworkspace.com
 * 
 */
public class dbTest {
	public static void main(String[] args) {

		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager
					.getConnection("jdbc:sqlite:booking");
			statement = connection.createStatement();
			resultSet = statement
					.executeQuery("SELECT bookingID FROM booking");
			while (resultSet.next()) {
				System.out.println("Booking ID:"
						+ resultSet.getString("bookingID"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

