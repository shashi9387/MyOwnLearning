import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCenterpriseversion {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;

		String url = "jdbc:mysql://localhost:3306/ineurondb";
		String user = "root";
		String password = "Rahul@8409";

		connection = DriverManager.getConnection(url, user, password);
		try {
			if (connection != null) {
				statement = connection.createStatement();

				if (statement != null) {
					String SqlSelectQuery = "select Sid,Sname,Saddress,Sage from student";
					resultset = statement.executeQuery(SqlSelectQuery);

					if (resultset != null) {
						System.out.println("SID\tSNAME\tSAGE\tSADDR");
						while (resultset.next()) {

//							System.out.println(resultset.getInt(1));
//							System.out.println(resultset.getString(3));
//							System.out.println(resultset.getInt(4));
//							System.out.println(resultset.getString(2));
							System.out.println(resultset.getInt(1) + "\t" + resultset.getString(2) + "\t"
									+ resultset.getString(3) + "\t" + resultset.getInt(4));
						}
					}
				}
			}
		} catch (SQLException se) {
			se.getStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		}

		finally {
			if (resultset != null) {
				resultset.close();
			}

			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}