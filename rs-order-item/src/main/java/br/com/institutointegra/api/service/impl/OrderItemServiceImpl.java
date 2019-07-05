package br.com.institutointegra.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.institutointegra.api.model.OrderItem;
import br.com.institutointegra.api.repository.OrderItemRepository;
import br.com.institutointegra.api.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderRepository;
	
	@Override
	public List<OrderItem> getAll() {
		return this.orderRepository.findAll();
	}

	@Override
	public OrderItem save(OrderItem p) {
		return this.orderRepository.save(p);
	}

	@Override
	public OrderItem findById(Long id) {
		return this.orderRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		this.orderRepository.deleteById(id);
	}

}