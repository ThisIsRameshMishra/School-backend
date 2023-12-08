package com.SNPublicSchool.School.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SNPublicSchool.School.Entity.ContactPageEntity;
import com.SNPublicSchool.School.Service.ContactPageService;

@Controller
@RequestMapping("/contact")
@CrossOrigin
public class ContactPageController {

    @Autowired
    private ContactPageService contactPageService;

    @PostMapping
    public ResponseEntity<ContactPageEntity> setDetailsInTable(@RequestBody ContactPageEntity request){
        return new ResponseEntity<ContactPageEntity>(contactPageService.setDetails(request), HttpStatus.CREATED);

    }

}
