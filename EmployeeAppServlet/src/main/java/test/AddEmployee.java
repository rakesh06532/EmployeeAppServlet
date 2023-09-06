package test;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployee extends GenericServlet {
	public void init() {
		//no code
	}
	public void service(ServletRequest req, ServletResponse res)
	    throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		EmployeeBean eb=new EmployeeBean();
		eb.setEmployeeNo(req.getParameter("id"));
		eb.setEmployeeName(req.getParameter("name"));
		eb.setEmployeeJob(req.getParameter("job"));
		eb.setEmployeeMgr(req.getParameter("mgr"));
		eb.setEmployeeDate(req.getParameter("date"));
		eb.setEmployeeSal(Float.parseFloat(req.getParameter("sal")));
		eb.setEmployeeCom(Integer.parseInt(req.getParameter("com")));
		eb.setEmployeeDept(Integer.parseInt(req.getParameter("dept")));
		
		int k=new insertDAO().insert(eb);
		if(k>0) {
			pw.println("Employee inserted successfully...");
		}
		RequestDispatcher rd=req.getRequestDispatcher("employee.html");
		rd.include(req, res);
	}
	public void destroy() {
		//no code
	}

}
