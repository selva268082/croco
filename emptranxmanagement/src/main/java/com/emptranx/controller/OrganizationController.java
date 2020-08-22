package com.emptranx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emptranx.bean.EmployeeHealthInsuranceTable;
import com.emptranx.bean.EmployeeInfo;
import com.emptranx.bean.EmployeeTable;
import com.emptranx.bean.ValidateResponse;
import com.emptranx.exception.EmployeeServiceException;
import com.emptranx.repository.EmployeeRepository;
import com.emptranx.service.OrganizationImpl;

@RestController
@RequestMapping("/emp")
public class OrganizationController {

	@Autowired
	EmployeeRepository employeeRepo;

	@Autowired
	OrganizationImpl organizationImpl;

	@Autowired
	RestTemplate restTemplate;
	
	
	@RequestMapping(path = "/register/{empId}", method = RequestMethod.POST)
	public String registerEmployee(@PathVariable String empId, @RequestBody EmployeeInfo employeeInfo,@RequestParam String fname)
			throws EmployeeServiceException {
		
	    HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity requestEntity =new HttpEntity(httpHeaders);
		
		//ResponseEntity<ValidateResponse> validateResponse=restTemplate.exchange("http://localhost:8090/org/emp/validate/"+empId, HttpMethod.GET, requestEntity, ValidateResponse.class);
		ResponseEntity<ValidateResponse> validateResponse=restTemplate.getForEntity("http://localhost:8090/org/emp/validate/"+empId,  ValidateResponse.class);
		
		System.out.println("validateResponse : : "+ validateResponse.getBody().isValid());
		
		/*
		 * EmployeeTable empTable = new EmployeeTable(); empTable.setEmpId(empId);
		 * empTable.setEmpDept(employeeInfo.ge
		 * tEmpDept());
		 * empTable.setEmpName(employeeInfo.getEmpName());
		 * empTable.setEmployeeAddr(employeeInfo.getEmployeeAddr());
		 * 
		 * EmployeeHealthInsuranceTable employeeHealthInsuranceTable = new
		 * EmployeeHealthInsuranceTable(); employeeHealthInsuranceTable
		 * .setEmpCoverageAmount(employeeInfo.getEmployeeHealthInsuranceData().
		 * getEmpCoverageAmount()); employeeHealthInsuranceTable.setEmpHealthId(empId);
		 * employeeHealthInsuranceTable
		 * .setEmpHealthCoverageScheme(employeeInfo.getEmployeeHealthInsuranceData().
		 * getEmpHealthCoverageScheme());
		 * 
		 * organizationImpl.joinOrganization(empTable, employeeHealthInsuranceTable,
		 * empId);
		 */
		return "Succeffuly employee registered!";
	}

	/*
	 * @RequestMapping(path = "/retrieve/{empId}",method = RequestMethod.GET) public
	 * Optional<EmployeeData> getEmployee(@PathVariable String empId) {
	 * List<EmployeeData> lst=(List<EmployeeData>) employeeRepo.findAll(); return
	 * lst.stream().filter(e-> empId.equalsIgnoreCase(e.getEmpId())).findAny(); }
	 */

}
