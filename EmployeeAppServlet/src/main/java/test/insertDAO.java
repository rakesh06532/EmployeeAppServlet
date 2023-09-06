package test;
import java.sql.*;

public class insertDAO {
	public int k=0;
	public int insert(EmployeeBean eb) {
	try {
	      Connection con=DBConnection.getCon();
	      PreparedStatement ps= con.prepareStatement
	    		  ("insert into emp values(?,?,?,?,?,?,?,?)");
	      ps.setString(1, eb.getEmployeeNo());
	      ps.setString(2, eb.getEmployeeName());
	      ps.setString(3, eb.getEmployeeJob());
	      ps.setString(4, eb.getEmployeeMgr());
	      ps.setString(5, eb.getEmployeeDate());
	      ps.setFloat(6, eb.getEmployeeSal());
	      ps.setInt(7, eb.getEmployeeCom());
	      ps.setInt(8, eb.getEmployeeDept());
	      
	      k=ps.executeUpdate();
	     
	    }catch(Exception e) {e.printStackTrace();}
	return k;
	}

}
