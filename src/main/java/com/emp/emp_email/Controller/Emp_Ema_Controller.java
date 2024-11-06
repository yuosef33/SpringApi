package com.emp.emp_email.Controller;


import com.emp.emp_email.Dto.EmailDto;
import com.emp.emp_email.Dto.EmployeeDto;
import com.emp.emp_email.Service.EmailService;
import com.emp.emp_email.Service.EmailServiceImpl;
import com.emp.emp_email.Service.EmployeeService;
import com.emp.emp_email.Service.EmployeeServiceImpl;
import com.emp.emp_email.model.Email;
import com.emp.emp_email.model.Employee;
import jakarta.transaction.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/Controller")
public class Emp_Ema_Controller {
    @Autowired
    private EmployeeService employeeService;

@Autowired
    private EmailService emailService;
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;
    @Autowired
    private EmailServiceImpl emailServiceImpl;


    @PostMapping("/add_Employee")
    ResponseEntity<Void> add_Empolyee(@Validated @RequestBody EmployeeDto employeeDto){
        employeeService.addEmployee(employeeDto);
        return ResponseEntity.created(URI.create("/add_Employee")).build();
    }
    @PostMapping("/updateEmployee")
    ResponseEntity<Void> updateEmpolyee(@Validated @RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return ResponseEntity.created(URI.create("/updateEmployee")).build();
    }
    @DeleteMapping("/deleteEmployee")
    ResponseEntity<Void> deleteEmployeeById( @RequestParam Long id){
        employeeService.removeEmployee(id);
        return  ResponseEntity.noContent().build();
    }
@GetMapping("/getAllemployees")
ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        return ResponseEntity.ok(employeeServiceImpl.getAllEmployee());
    }

    @GetMapping("/getEmployeeById")

    ResponseEntity<EmployeeDto> getEmpolyeeById( @RequestParam Long id){
       return ResponseEntity.ok().body( employeeServiceImpl.getEmployeeById(id));
    }
    @GetMapping("/getAllEmployeeByIds")

    ResponseEntity<List<EmployeeDto>> getAllEmpolyeeByIds( @RequestParam List<Long> ids){
        return ResponseEntity.ok().body( employeeServiceImpl.getAllEmployeeById(ids));
    }
    @GetMapping("/getEmployeeByName")
    List<Employee> getEmpolyeeByName( @RequestParam String name){
      return  employeeServiceImpl.getEmployeeByName(name);
    }

    // Email-------------------------------------------
    //-------------------------------------------------

    @PostMapping("/addEmail")
    ResponseEntity<Void> addEmail(@Validated @RequestBody EmailDto emailDto) {
        emailService.addEmail(emailDto);
        return ResponseEntity.created(URI.create("/addEmail")).build();
    }
    @PostMapping("/updateEmail")
    ResponseEntity<Void> updateEmail(@Validated @RequestBody Email email){
         emailService.updateEmail(email);
        return ResponseEntity.created(URI.create("/addEmail")).build();
    }
    @DeleteMapping("/deleteEmail")
    ResponseEntity<Void> deleteEmailById( @RequestParam Long id){
        emailService.removeEmail(id);
        return  ResponseEntity.noContent().build();
    }
    @GetMapping("/getAlleEmails")
    ResponseEntity<List<EmailDto>> getAllEmails(){
        return ResponseEntity.ok(emailService.getAllEmails());
    }
    @GetMapping("/getAllEmailsByIds")
    ResponseEntity<List<EmailDto>> getAllEmailsById( @RequestParam List<Long>ids){
        return ResponseEntity.ok(emailServiceImpl.getAllEmailByids(ids));
    }
    @GetMapping("/getEmailsByName")
    List<Email> getEmailByname(@RequestParam String name){
       return emailService.getAllEmailByName(name);
    }
    @GetMapping("/getEmailBycontent")
    List<Email> getEmailBycontent(@RequestParam String content){
      return  emailService.getAllEmailByContent(content);
    }







}
