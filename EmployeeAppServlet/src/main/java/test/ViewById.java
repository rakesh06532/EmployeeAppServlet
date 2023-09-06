package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;

@SuppressWarnings("serial")
@WebServlet("/viewbyid")
public class ViewById extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)
	   throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		EmployeeBean eb=new EmployeeBean();
		eb.setEmployeeNo(req.getParameter("id"));

		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select * from emp where empno=?");
			ps.setString(1, eb.getEmployeeNo());
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+
			rs.getString(3)+"&nbsp&nbsp"+rs.getString(4)+"&nbsp&nbsp"+rs.getString(5)+
			"&nbsp&nbsp"+rs.getFloat(6)+"&nbsp&nbsp"+rs.getInt(7)+"&nbsp&nbsp"+rs.getInt(8)+"<br>");
			}
		}catch(Exception e) {e.printStackTrace();}
		RequestDispatcher rd=req.getRequestDispatcher("employee.html");
		rd.include(req, res);
	}

}
