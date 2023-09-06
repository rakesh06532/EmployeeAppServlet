package test;
import java.util.*;
import java.sql.*;

public class RetrieveDAO {
	ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
	public ArrayList<EmployeeBean> view(){
		try {
		Connection con= DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement
				("select * from emp");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			EmployeeBean eb=new EmployeeBean();
			eb.setEmployeeNo(rs.getString(1));
			eb.setEmployeeName(rs.getString(2));
			eb.setEmployeeJob(rs.getString(3));
			eb.setEmployeeMgr(rs.getString(4));
			eb.setEmployeeDate(rs.getString(5));
			eb.setEmployeeSal(rs.getFloat(6));
			eb.setEmployeeCom(rs.getInt(7));
			eb.setEmployeeDept(rs.getInt(8));
			
			al.add(eb);
		}
		}catch(Exception e) {e.printStackTrace();}
		return al;
	}

}
