package in.ashokit.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.getWriter().write("<h1> Hello Welcome to JRTP Training</h1>");
		System.out.println("method executed");
	}

	
	
	
	
	
	
}
