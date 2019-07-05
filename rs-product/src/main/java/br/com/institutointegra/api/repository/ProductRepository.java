package br.com.institutointegra.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.institutointegra.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
