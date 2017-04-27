package com.plm.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plm.beans.Employee;
import com.plm.dao.EmployeeDao;
import com.plm.exceptions.EmployeeException;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao empdao;

	//get All Employee
	/**
	 * method call : /employee
	 * @param employee
	 * @return List<Employee>
	 */
	@RequestMapping(path="/employee", method= RequestMethod.GET , produces ={"application/json"})
	public List<Employee> getAllEmployee(Employee employee) {
		return empdao.getAllEmployee();
	}


	/**----------------------------------------------------------------------------------------------- 
	 * Following is the JSON structure to pass to Employee Controller
	 * -----------------------------------------------------------------------------------------------
	 * {"empId":0,"firstName":"Sudarshan","lastName":"Gaikwad","loginName":"avdm1h","title":"Software Engineer",
		"department":{	"deptId":0,
              			"name":"pune",
              			"address":{	"city":"pune",
                        			"zip":410004,
                        			"street":"Baner"
                      				}
            			},
  		"address":{ "city":"akluj",
              		"zip":412412,
              		"street":"Anandnagr"
            		},
  		"empRole":[{"roleId":0,"roleName":"Developer"}]}
  		----------------------------------------------------------------------------------------------
	 * @param employee
	 */

	@RequestMapping(path="/employee", method= RequestMethod.POST , produces ={"application/json"}, consumes={"application/json"})
	public void createEmployee(@RequestBody Employee employee) {
		empdao.saveEmployee(employee);
	}

	/**-----------------------------------------------------------------------------------------------
	 * Search Employee By Id  
	 * -----------------------------------------------------------------------------------------------
	 * path : /employee/id
	 * @param id
	 * @return
	 */
	@RequestMapping(path="/employee/{id}" , method= RequestMethod.GET , produces ={"application/json"})
	public  Employee getSingleEmployee(@PathVariable("id") Integer id){

		System.err.println("Employye id ="+ id );
		
		Employee employee= empdao.findEmployee(id);
		if(employee == null)
			try {
				throw new EmployeeException(0);
			} catch (EmployeeException e) {
				e.printStackTrace();
			}
		
		return employee;
	}


}
