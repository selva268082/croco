package com.emptranx.bean;

import org.springframework.stereotype.Component;

@Component
public class EmployeeInfo {
 
	private String empId;
	private String empName;
	private String empDept;
 	private EmployeeAddr employeeAddr;
	private EmployeeHealthInsuranceData employeeHealthInsuranceData;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public EmployeeAddr getEmployeeAddr() {
		return employeeAddr;
	}
	public void setEmployeeAddr(EmployeeAddr employeeAddr) {
		this.employeeAddr = employeeAddr;
	}
	public EmployeeHealthInsuranceData getEmployeeHealthInsuranceData() {
		return employeeHealthInsuranceData;
	}
	public void setEmployeeHealthInsuranceData(EmployeeHealthInsuranceData employeeHealthInsuranceData) {
		this.employeeHealthInsuranceData = employeeHealthInsuranceData;
	}
	
	  

}
