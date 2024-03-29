package br.com.institutointegra.api.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String password;
	
	@Email
	private String email;
	
	@Column(name="created_date")
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="alter_date")
	private LocalDateTime alterDate;
	
	
	//GETS AND SETS	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getCreateDate() {
		return createdDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createdDate = createDate;
	}
	public LocalDateTime getAlterDate() {
		return alterDate;
	}
	public void setAlterDate(LocalDateTime alterDate) {
		this.alterDate = alterDate;
	}
	
	

	

	



	
}
