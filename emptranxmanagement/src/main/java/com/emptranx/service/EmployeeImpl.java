package com.emptranx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emptranx.bean.EmployeeTable;
import com.emptranx.inter.face.Employee;
import com.emptranx.repository.EmployeeRepository;

@Service
public class EmployeeImpl implements Employee {

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public void registerEmployeeInfo(EmployeeTable emp, String empId) {
		empRepo.save(emp);
	}

	@Override
	public void removeEmployeeInfo(String empId) {
		empRepo.deleteById(empId);

	}

}
