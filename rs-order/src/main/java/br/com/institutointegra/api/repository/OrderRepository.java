package br.com.institutointegra.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.institutointegra.api.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
