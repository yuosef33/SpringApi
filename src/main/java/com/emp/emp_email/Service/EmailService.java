package com.emp.emp_email.Service;

import com.emp.emp_email.Dao.EmployeeDao;
import com.emp.emp_email.Dto.EmailDto;
import com.emp.emp_email.model.Email;
import com.emp.emp_email.model.Employee;
import jakarta.transaction.SystemException;

import java.util.List;
public interface EmailService {


    void addEmail(EmailDto emailDto)  ;
    void removeEmail(Long id);
    void updateEmail(Email email) ;
    List<EmailDto> getAllEmails();
    List<Email> getAllEmailByName(String name);
    List<Email> getAllEmailByContent(String content);

}
