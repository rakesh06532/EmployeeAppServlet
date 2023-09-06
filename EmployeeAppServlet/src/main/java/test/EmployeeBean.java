package test;

import java.io.*;

@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {
	private String EmployeeNo,EmployeeName,EmployeeJob,EmployeeMgr,
	EmployeeDate;
	private float EmployeeSal;
	public String getEmployeeNo() {
		return EmployeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		EmployeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeJob() {
		return EmployeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		EmployeeJob = employeeJob;
	}
	public String getEmployeeMgr() {
		return EmployeeMgr;
	}
	public void setEmployeeMgr(String employeeMgr) {
		EmployeeMgr = employeeMgr;
	}
	public String getEmployeeDate() {
		return EmployeeDate;
	}
	public void setEmployeeDate(String employeeDate) {
		EmployeeDate = employeeDate;
	}
	public int getEmployeeCom() {
		return EmployeeCom;
	}
	public void setEmployeeCom(int employeeCom) {
		EmployeeCom = employeeCom;
	}
	public float getEmployeeSal() {
		return EmployeeSal;
	}
	public void setEmployeeSal(float employeeSal) {
		EmployeeSal = employeeSal;
	}
	public int getEmployeeDept() {
		return EmployeeDept;
	}
	public void setEmployeeDept(int employeeDept) {
		EmployeeDept = employeeDept;
	}
	private int EmployeeDept,EmployeeCom;

}
