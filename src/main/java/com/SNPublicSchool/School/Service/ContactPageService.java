package com.SNPublicSchool.School.Service;

import com.SNPublicSchool.School.Entity.ContactPageEntity;
import com.SNPublicSchool.School.Repository.ContactPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactPageService {

   @Autowired
    private ContactPageRepository contactPageRepository;

    public ContactPageEntity setDetails(ContactPageEntity request){
    	String email=request.getEmail();
		 if(contactPageRepository.findByEmail(request.getEmail())!=null) throw new RuntimeException("Record already exists");
		 if(request.getEmail().length()==0 || request.getName().length()==0 || request.getMessage().length()==0 || request.getPhoneNumber().length()==0){
	            throw new RuntimeException("Please Provide the complete details");
	        }
        return contactPageRepository.save(request);
    }
}
