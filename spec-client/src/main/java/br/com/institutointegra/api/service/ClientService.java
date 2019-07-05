package br.com.institutointegra.api.service;

import java.util.List;
import java.util.Map;

import br.com.institutointegra.api.dto.ClientDto;

public interface ClientService {

	ClientDto save (ClientDto dto);
	ClientDto saveFeign (ClientDto dto);
	List<ClientDto> getAll ();
	
	Map<String,String> viewPort();
	
}
