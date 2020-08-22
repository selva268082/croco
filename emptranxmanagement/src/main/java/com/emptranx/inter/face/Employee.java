package com.emptranx.inter.face;

import com.emptranx.bean.EmployeeTable;

public interface Employee {
	
	void registerEmployeeInfo(EmployeeTable emp,String empId);
	void removeEmployeeInfo(String empId);

}
