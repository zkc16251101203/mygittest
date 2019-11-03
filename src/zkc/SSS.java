package zkc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SSS
 */
@WebServlet("/SSS")
public class SSS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SSS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletContext sss=request.getServletContext();
//		HttpSession session = request.getSession();
//		String heading;
//		Integer accessCount =(Integer)sss.getAttribute("accessCount");
//		if(accessCount == null||accessCount==0) {
//		accessCount = new Integer(0);
//		heading = "Welcom,You are first time to visit!";
//		}
//		else {
//		heading = "Welcome Backer";
//		accessCount = new Integer(accessCount.intValue()+1);
//		}
//		sss.setAttribute("accessCount",accessCount);
//		
//		PrintWriter out = response.getWriter();
//		out.println("The title:"+heading);
//		out.println("Access count: "+accessCount);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");;
		HttpSession st= request.getSession();
		PrintWriter out = response.getWriter();
		Integer count=(Integer) st.getAttribute("count");
		if(count==null||count==0) {
			out.print("��һ�η���");
			count=new Integer(1);
		}else {
			count=count+1;
			out.print("��ӭ��������"+"���ʴ���"+count);
		}
		st.setAttribute("count", count);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
