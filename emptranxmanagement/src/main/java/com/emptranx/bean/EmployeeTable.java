package com.emptranx.bean;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeTable {
	@Id
	private String empId;
	private String empName;
	private String empDept;
	@Embedded
	private EmployeeAddr employeeAddr;
	
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
}
