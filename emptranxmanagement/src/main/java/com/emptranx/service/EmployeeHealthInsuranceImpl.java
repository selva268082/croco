package com.emptranx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emptranx.bean.EmployeeHealthInsuranceTable;
import com.emptranx.exception.EmployeeServiceException;
import com.emptranx.inter.face.EmployeeHelathInsurance;
import com.emptranx.repository.EmployeeHealthInfoRepository;

@Service
public class EmployeeHealthInsuranceImpl implements EmployeeHelathInsurance {

	@Autowired
	EmployeeHealthInfoRepository empHealthInfoRepo;

	@Override
	public void registerEmployeeHealthInsuranceInfo(EmployeeHealthInsuranceTable employeeHealthInsuranceData,
			String empId) throws EmployeeServiceException {
		
		  if("emp-101".equalsIgnoreCase(empId)) { 
			  throw new EmployeeServiceException("Exception");
			  }
		 
		empHealthInfoRepo.save(employeeHealthInsuranceData);
	}

	@Override
	public void removeEmployeeHealthInsuranceInfo(String empId) {
		empHealthInfoRepo.deleteById(empId);
	}

}
