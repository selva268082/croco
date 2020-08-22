package com.emptranx.repository;

import org.springframework.data.repository.CrudRepository;

import com.emptranx.bean.EmployeeTable;

public interface EmployeeRepository extends CrudRepository<EmployeeTable, String>{

	
}
