package com.emp.emp_email.Mapper;

import com.emp.emp_email.Dto.EmployeeDto;
import com.emp.emp_email.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
EmployeeMapper employeeMapper=Mappers.getMapper(EmployeeMapper.class);
    @Mapping(target = "emails", ignore = true)
Employee convertFromEmployeeDtoToEmployee(EmployeeDto employeeDto);
    @Mapping(target = "emails", ignore = true)
List<EmployeeDto>  convertFromEmployeeListToEmployeeDtoList(List<Employee> employees);

}
