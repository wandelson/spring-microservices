package br.com.institutointegra.api.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class OrderItem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_product")
	private Long idProduct;
	
	@Column(name="id_order")
	private Long idOrder;
	
	private Long amount;
	
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
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
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
