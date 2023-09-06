package test;
import java.util.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmp extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)
	   throws ServletException, IOException {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			
		 ArrayList<EmployeeBean> al=new RetrieveDAO().view();
		 if(al.size()==0) {
			 pw.println("Employee Data no available...");
		 }
		 else {
			 Iterator<EmployeeBean> it=al.iterator();
			 while(it.hasNext()) {
				 EmployeeBean eb=(EmployeeBean)it.next();
				 pw.println(eb.getEmployeeNo()+ "&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeName()+
				"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeJob()+"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeMgr()+
				"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeDate()+"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeSal()+
				"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeCom()+"&nbsp&nbsp&nbsp&nbsp"+eb.getEmployeeDept()+"<br>");
			 }
		 }
		}catch (Exception e) {e.printStackTrace();}
		RequestDispatcher rd=req.getRequestDispatcher("employee.html");
		rd.include(req, res);
	}
	
}
