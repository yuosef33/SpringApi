package com.emp.emp_email.model;

import com.emp.emp_email.model.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String content;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
