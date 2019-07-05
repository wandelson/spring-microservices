package br.com.institutointegra.api.service;

import java.util.List;

import br.com.institutointegra.api.model.Product;

public interface ProductService {
	List<Product> getAll();
	
	Product save(Product p);
	
	Product findById(Long id);
	
	void delete(Long id);
}
