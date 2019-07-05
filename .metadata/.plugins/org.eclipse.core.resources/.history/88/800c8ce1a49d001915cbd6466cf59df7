package br.com.institutointegra.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.institutointegra.api.model.Order;
import br.com.institutointegra.api.repository.OrderRepository;
import br.com.institutointegra.api.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAll() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order save(Order p) {
		return this.orderRepository.save(p);
	}

	@Override
	public Order findById(Long id) {
		return this.orderRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		this.orderRepository.deleteById(id);
	}

}
