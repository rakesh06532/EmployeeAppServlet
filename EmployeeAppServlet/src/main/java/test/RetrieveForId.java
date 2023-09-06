//package test;
//
//import java.util.ArrayList;
//import java.sql.*;
//
//public class RetrieveForId {
//	public String st="";
//	public String showId(EmployeeBean eb){
//		try {
//			Connection con=DBConnection.getCon();
//			PreparedStatement ps=con.prepareStatement
//					("select * from emp where empno=?");
//			
//				ps.setString(1, eb.getEmployeeNo());
//				ResultSet rs=ps.executeQuery();
//				
//		}catch(Exception e) {e.printStackTrace();}
//		return st;
//	}
//
//}
