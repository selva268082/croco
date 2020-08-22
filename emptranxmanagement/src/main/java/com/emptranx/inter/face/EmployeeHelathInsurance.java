/**
 * 
 */
package com.emptranx.inter.face;

import com.emptranx.bean.EmployeeHealthInsuranceTable;
import com.emptranx.exception.EmployeeServiceException;

/**
 * @author selva
 *
 */
public interface EmployeeHelathInsurance {
	

	void registerEmployeeHealthInsuranceInfo(EmployeeHealthInsuranceTable emp,String empId) throws EmployeeServiceException;
	void removeEmployeeHealthInsuranceInfo(String empId);

}
