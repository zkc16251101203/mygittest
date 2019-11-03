package zkc;
import zkc.UserBean;
import zkc.RegisterFormBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    response.setHeader("Content-type","text/html;charset=GBK");
		    response.setCharacterEncoding("GBK");
		    String name=request.getParameter("name");
		    String password=request.getParameter("password");
		    String password2=request.getParameter("password2");
		    String email=request.getParameter("email");
		    RegisterFormBean formBean=new RegisterFormBean();
		    formBean.setName(name);
		    formBean.setPassword(password);
		    formBean.setPassword2(password2);
		    formBean.setEmail(email);
		    if(!formBean.validate()) {
		    	request.setAttribute("formBean", formBean);
		    	request.getRequestDispatcher("register.jsp").forward(request,response);
		    	return;
		    	}
		    UserBean userBean=new UserBean();
		    userBean.setName(name);
		    userBean.setPassword(password);
		    userBean.setEmail(email);
		    boolean b=DBUtil.getInstance().insertUser(userBean);
		    if(!b) {
		    	request.setAttribute("DBMes", "��ע����û��Ѵ���");
		    	request.setAttribute("formBean",formBean);
		    	request.getRequestDispatcher("register.jsp").forward(request, response);
		    	return;
		    }
		    response.getWriter().println("��ϲ��ע��ɹ���3����Զ���ת");
		    request.getSession().setAttribute("userBean", userBean);
		    response.setHeader("refresh","3;url=loginsuccess.jsp");
	}

}
