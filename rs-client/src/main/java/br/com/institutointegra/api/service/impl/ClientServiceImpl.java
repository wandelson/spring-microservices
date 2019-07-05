package br.com.institutointegra.api.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.institutointegra.api.model.Client;
import br.com.institutointegra.api.repository.ClientRepository;
import br.com.institutointegra.api.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> getAll() {
		return this.clientRepository.findAll();
	}

	@Override
	public Client save(Client p) {
		p.setCreatedDate(LocalDateTime.now());
		return this.clientRepository.save(p);
	}

	@Override
	public Client findById(Long id) {
		return this.clientRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		this.clientRepository.deleteById(id);
	}

	@Override
	public Client update(Client p) {
		p.setAlterDate(LocalDateTime.now());
		return this.clientRepository.save(p);
	}





}