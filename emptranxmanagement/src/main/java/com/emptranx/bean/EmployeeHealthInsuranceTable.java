package com.emptranx.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeHealthInsuranceTable {
    @Id
	private String empHealthId;
	private String empHealthCoverageScheme;
	private int empCoverageAmount;
	
	public int getEmpCoverageAmount() {
		return empCoverageAmount;
	}
	public void setEmpCoverageAmount(int empCoverageAmount) {
		this.empCoverageAmount = empCoverageAmount;
	}
	public String getEmpHealthId() {
		return empHealthId;
	}
	public void setEmpHealthId(String empHealthId) {
		this.empHealthId = empHealthId;
	}
	public String getEmpHealthCoverageScheme() {
		return empHealthCoverageScheme;
	}
	public void setEmpHealthCoverageScheme(String empHealthCoverageScheme) {
		this.empHealthCoverageScheme = empHealthCoverageScheme;
	}
	 
}
