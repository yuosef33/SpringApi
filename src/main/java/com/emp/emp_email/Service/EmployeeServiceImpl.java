package com.emp.emp_email.Service;


import com.emp.emp_email.Dao.EmployeeDao;
import com.emp.emp_email.Dto.EmployeeDto;
import com.emp.emp_email.Mapper.EmployeeMapper;
import com.emp.emp_email.model.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
   @Autowired
  private ModelMapper modelMapper;




    @Override
   public void addEmployee(EmployeeDto employeeDto)  {
        Employee emp= EmployeeMapper.employeeMapper.toEnitiy(employeeDto);

        employeeDao.save(emp);
    }
    @Override
    public  void removeEmployee(Long id){
       employeeDao.deleteById(id);
    }
    @Override
    public  void updateEmployee(Employee employee) {
       employeeDao.save(employee);
    }
    @Override
    public List<EmployeeDto> getAllEmployee(){
      return EmployeeMapper.employeeMapper.toListDto(employeeDao.findAll());
    }
    @Override
    public  EmployeeDto getEmployeeById(Long id){

        return EmployeeMapper.employeeMapper.toDto(employeeDao.findById(id).get());
    }
    @Override
    public  List<EmployeeDto> getAllEmployeeById(List<Long> ids){


        return EmployeeMapper.employeeMapper.toListDto(employeeDao.findAllById(ids)) ;
    }

    @Override
    public List<Employee> getEmployeeByName(String name){

       return employeeDao.findByName(name);
    }


}
