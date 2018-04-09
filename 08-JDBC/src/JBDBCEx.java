import java.sql.PreparedStatement;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Connection;


public class JBDBCEx {

	
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student name");
			String name=sc.next();
			System.out.println("enter the student age");
			int age= sc.nextInt();
			System.out.println("enter the student address");
			String address=sc.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","sairam1234");
		    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		    ps.setString(1,name);
		    ps.setInt(2, age);
		    ps.setString(3,address);
		    int res=ps.executeUpdate();
		    if(res==0)
		    {
		    	System.out.println(" data is not inserted in student table");
		    }
		    else
		    {
		    	System.out.println(" data is inserted in student table");
		    }
		    ps.close();
		    con.close();
		    sc.close();
		    }
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		

	}

}