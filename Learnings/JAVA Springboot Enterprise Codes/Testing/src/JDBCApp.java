
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class JDBCApp {
	public static void main(String[] args) throws SQLException {

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		System.out.println("Driver registered succesfully");

		String url = "jdbc:mysql://localhost:3306/ineurondb";
		String username = "root";
		String password = "Rahul@8409";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection object is created:: " + connection);

		Statement statement = connection.createStatement();
		System.out.println("Statement object is created:: " + statement);

		String sqlSelectQuery = "select Sid,Sname,Sage,Saddress from Student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("ResultSet object is created:: " + resultSet);

		System.out.println("SID\tSNAME\tSAGE\tSADDR");

		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String team = resultSet.getString(4);
			System.out.println(id + "\t" + name + "\t" + age + "\t" + team);
		}

		connection.close();
		System.out.println("Closed the connection");
	}
}
