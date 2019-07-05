package br.com.institutointegra.api.service;

import java.util.List;

import br.com.institutointegra.api.model.User;

public interface UserService {
	List<User> getAll();
	
	User save(User p);
	
	User findById(Long id);
	
	void delete(Long id);
}
