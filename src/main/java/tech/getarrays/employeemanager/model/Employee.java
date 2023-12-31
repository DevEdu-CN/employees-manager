package tech.getarrays.employeemanager.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageURL;
	private String embloyeeCode;
	
	public Employee() {}
	
	public Employee(String name, String email, String jobTitle, String phone,
			String imageURL, String embloyeeCode) {
		this.setName(name); 
		this.setEmail(email);
		this.setJobTitle(jobTitle);
		this.setPhone(phone);
		this.setImageURL(imageURL);
		this.setEmbloyeeCode(embloyeeCode);
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getEmbloyeeCode() {
		return embloyeeCode;
	}

	public void setEmbloyeeCode(String embloyeeCode) {
		this.embloyeeCode = embloyeeCode;
	}
	
	public String toString() {
		return "Employee{" + 
				"id=" + id + '\'' + 
				"name=" + name + '\'' + 
				"email=" + email + '\'' + 
				"jobTitle=" + jobTitle + '\'' + 
				"phone=" + phone + '\'' +  
				"imageURL=" + imageURL + '\'' + 
				'}';
		
	}
}
