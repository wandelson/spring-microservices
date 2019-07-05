package br.com.institutointegra.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.criterion.Example.NotNullOrZeroPropertySelector;


@Entity
public class Client {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 3, max = 100)
	@NotEmpty
	private String name;
	
	@Column(name="id_user")
	private Long idUser;
	
	@Column(name="created_date", updatable = false)
	//@CreationTimestamp
	private LocalDateTime createdDate;
	
	//@UpdateTimestamp
	@Column(name="alter_date")
	private LocalDateTime alterDate;
	
	
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

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getAlterDate() {
		return alterDate;
	}

	public void setAlterDate(LocalDateTime alterDate) {
		this.alterDate = alterDate;
	}

	
}