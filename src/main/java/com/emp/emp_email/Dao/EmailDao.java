package com.emp.emp_email.Dao;

import com.emp.emp_email.model.Email;
import com.emp.emp_email.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailDao extends JpaRepository<Email,Long> {

List<Email> getAllByName(String name);
    List<Email> getAllByContent(String content);

}
