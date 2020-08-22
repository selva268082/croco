package com.emptranx.inter.face;

import com.emptranx.bean.EmployeeTable;
import com.emptranx.exception.EmployeeServiceException;
import com.emptranx.bean.EmployeeHealthInsuranceTable;

public interface Organization {
	
	void joinOrganization(EmployeeTable empData,EmployeeHealthInsuranceTable empHealthData,String empId) throws EmployeeServiceException;
	void leaveOrganization(String empId);

}
