package com.SNPublicSchool.School.Repository;


import com.SNPublicSchool.School.Entity.ContactPageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactPageRepository extends JpaRepository<ContactPageEntity,Long> {
        ContactPageEntity findByEmail(String email);


}
