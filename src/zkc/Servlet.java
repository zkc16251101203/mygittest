package zkc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	    ServletContext sss=request.getServletContext();
		HttpSession session = request.getSession();
		String heading;
		Integer accessCount =(Integer)sss.getAttribute("accessCount");
		if(accessCount == null) {
		accessCount = new Integer(0);
		heading = "Welcom,You are first time to visit!";
		}
		else {
		heading = "Welcome Backer";
		accessCount = new Integer(accessCount.intValue()+1);
		}
		sss.setAttribute("accessCount",accessCount);
		
		PrintWriter out = response.getWriter();
		out.println("The title:"+heading);
		out.println("Access count: "+accessCount);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
