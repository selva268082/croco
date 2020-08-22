package com.emptranx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emptranx.bean.EmployeeHealthInsuranceTable;
import com.emptranx.bean.EmployeeTable;
import com.emptranx.exception.EmployeeServiceException;
import com.emptranx.inter.face.Employee;
import com.emptranx.inter.face.EmployeeHelathInsurance;
import com.emptranx.inter.face.Organization;

@Service
public class OrganizationImpl implements Organization {

	@Autowired
	Employee employeeService;

	@Autowired
	EmployeeHelathInsurance employeeHealthInsuranceService;

	@Override
	//@Transactional
	public void joinOrganization(EmployeeTable empData, EmployeeHealthInsuranceTable empHealthData, String empId) throws EmployeeServiceException {

		// call employee service and insert employee data
		employeeService.registerEmployeeInfo(empData, empId);

		// call employee health insurance and insert data
		employeeHealthInsuranceService.registerEmployeeHealthInsuranceInfo(empHealthData, empId);
	}

	@Override
	public void leaveOrganization(String empId) {

		// call employee service to remove employee data
		employeeService.removeEmployeeInfo(empId);

		// call employee service to remove health insurance data
		employeeHealthInsuranceService.removeEmployeeHealthInsuranceInfo(empId);
	}

}
