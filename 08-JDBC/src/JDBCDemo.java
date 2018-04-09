import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException {
		//Register Driver
		Driver driver=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		
		// Create Connection
		Connection con=DriverManager.getConnection("jdbc:thin:@localhost:1521/xe","","sairam1234");
		
	}

}
