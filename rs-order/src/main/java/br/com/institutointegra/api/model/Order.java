package br.com.institutointegra.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_client")
	private Long idClient;
	
	@Column(name="created_date")
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="alter_date")
	private LocalDateTime alterDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
