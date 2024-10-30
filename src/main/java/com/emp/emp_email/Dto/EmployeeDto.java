package com.emp.emp_email.Dto;

import com.emp.emp_email.model.Email;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;


@Data
public class EmployeeDto {


    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @Min(15)
    @Max(40)
    private int age;
    @Min(5000)
    @Max(10000)
    private int salary;
    @JsonIgnore
    private List<Email> emails;

}
