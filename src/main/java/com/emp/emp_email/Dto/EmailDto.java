package com.emp.emp_email.Dto;

import com.emp.emp_email.model.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class EmailDto {

    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @Email
    private String content;

    private EmployeeDto employee;

}
