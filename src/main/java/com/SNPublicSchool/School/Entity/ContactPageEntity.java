package com.SNPublicSchool.School.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.naming.Name;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="contactdb")
public class ContactPageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;

    private String phoneNumber;

    private String message;

    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
    
    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
    	this.phoneNumber=PhoneNumber;
    }
    
    public String getMessage() {
    	return this.message;
    }
    public void setMessage(String message) {
    	this.message=message;
    }
	
    
}
