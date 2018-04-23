
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class MyServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		
		HttpSession session=request.getSession();
		
		ServletContext application = request.getServletContext();

		if (userID.equals("userID") && password.equals("password")) {
			application.setAttribute("userID", userID);
			application.setAttribute("password", password);
			
			session.setAttribute("userID", userID);
			session.setAttribute("password", password);
			
		}
		//Enumeration<String> attributes = application.getAttributeNames();

		response.setContentType("text/html");
		OutputStream os = response.getOutputStream();
		PrintStream out = new PrintStream(os);
		
	//	while (attributes.hasMoreElements()) {
			//String key = attributes.nextElement();
			//Object value = application.getAttribute(key);
			//out.println("<b>key: " + key + ", value: " + value + "</b>");
			//out.println("<br>");
			out.println("<h3>Data from servlet context object</h3>");
			out.println("<b>key: UserID,"+application.getAttribute("userID"+"</b>"));
			out.println("<br>");
			out.println("<b>key: Password,"+application.getAttribute("password"+"</b>"));
			out.println("<br>");
			out.println("<br>");
			
			out.println("<h3>Data from HttpSession</h3>");
			out.println("<b>key: UserID,"+session.getAttribute("userID"+"</b>"));
			out.println("<br>");
			out.println("<b>key: Password,"+session.getAttribute("password"+"</b>"));
		//}

	}
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
//	{
//		request.getSession().invalidate();
//		response.setContentType("text/html");
//		OutputStream os = response.getOutputStream();
//		PrintStream out = new PrintStream(OS);
//		out.println("<h3 style=\"color:red\">Direct Access to this URL Restricted!</h3>");
//		
//		Cookie cookie=new Cookie("info","from doGet method from Myservlet.java");
//		response.addCookie(cookie);
		
	//}

}
