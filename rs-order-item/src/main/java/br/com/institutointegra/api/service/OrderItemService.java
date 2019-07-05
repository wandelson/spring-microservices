package br.com.institutointegra.api.service;

import java.util.List;

import br.com.institutointegra.api.model.OrderItem;

public interface OrderItemService {
	List<OrderItem> getAll();
	
	OrderItem save(OrderItem p);
	
	OrderItem findById(Long id);
	
	void delete(Long id);
}