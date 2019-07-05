package br.com.institutointegra.api.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import br.com.institutointegra.api.enums.ProductStatus;


@Entity
public class Product {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min = 3, max = 100)
	private String name;
	
	@NotEmpty
	@Size(min = 3, max = 100)
	private String description;
	
	@Enumerated(EnumType.ORDINAL)
	private ProductStatus status;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductStatus getStatus() {
		return status;
	}
	public void setStatus(ProductStatus status) {
		this.status = status;
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
