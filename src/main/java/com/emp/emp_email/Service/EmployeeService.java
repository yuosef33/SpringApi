package com.emp.emp_email.Service;

import com.emp.emp_email.Dao.EmployeeDao;
import com.emp.emp_email.Dto.EmployeeDto;
import com.emp.emp_email.model.Employee;
import jakarta.transaction.SystemException;

import java.util.List;

public interface EmployeeService {

   void addEmployee(EmployeeDto employeeDto) ;
   void removeEmployee(Long id);
   void updateEmployee(Employee employee);
   List<EmployeeDto> getAllEmployee();
   List<EmployeeDto> getAllEmployeeById(List<Long> ids);
   EmployeeDto getEmployeeById(Long id);
    List<Employee> getEmployeeByName(String name);

}
