package com.emp.emp_email.Service;

import com.emp.emp_email.Dao.EmailDao;
import com.emp.emp_email.Dto.EmailDto;
import com.emp.emp_email.Mapper.EmailMapper;
import com.emp.emp_email.model.Email;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailDao emailDao;
    @Autowired
    private ModelMapper modelMapper;




    public void addEmail(EmailDto emailDto)  {
//       if (email.getId() != null) {
//           throw new SystemException("id must be null");}
       Email ema= EmailMapper.emailmapper.toEntity(emailDto);
       emailDao.save(ema);
   }
    public   void removeEmail(Long id){
       emailDao.deleteById(id);
    }
    public  void updateEmail(Email email){
        emailDao.save(email);
    }
    public  List<EmailDto> getAllEmails(){

       return EmailMapper.emailmapper.toListDto(emailDao.findAll());

    }
    public  List<EmailDto> getAllEmailByids(List<Long> ids){
        return EmailMapper.emailmapper.toListDto(emailDao.findAllById(ids));

    }
    public  List<Email> getAllEmailByName(String name){
       return emailDao.getAllByName(name);
    }
    public  List<Email> getAllEmailByContent(String content){
       return emailDao.getAllByContent(content);

    }



}
