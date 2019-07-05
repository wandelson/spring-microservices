package br.com.institutointegra.api.service;

import java.util.List;

import br.com.institutointegra.api.model.Order;

public interface OrderService {
	List<Order> getAll();
	
	Order save(Order p);
	
	Order findById(Long id);
	
	void delete(Long id);
}