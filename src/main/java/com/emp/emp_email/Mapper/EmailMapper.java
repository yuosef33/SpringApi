package com.emp.emp_email.Mapper;

import com.emp.emp_email.Dto.EmailDto;
import com.emp.emp_email.Dto.EmployeeDto;
import com.emp.emp_email.model.Email;
import com.emp.emp_email.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmailMapper {

    EmailMapper emailmapper= Mappers.getMapper(EmailMapper.class);

    @Mapping(target = "employee", ignore = true)
    Email convertFromEmailDtoToEmail(EmailDto emailDto);
    @Mapping(target = "employee", ignore = true)
    List<EmailDto> convertFromEmailListToEmailDtoList(List<Email> emails);



}
