import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class markTest

{
	public static void main (String[] args)
	
	{
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager
					.getConnection("jdbc:sqlite:marks");
			statement = connection.createStatement();
			resultSet = statement
					.executeQuery("SELECT * FROM marks");
			while (resultSet.next()) {
				System.out.println("Mark Id is :"
						+ resultSet.getString("*"));
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
