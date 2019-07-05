package br.com.institutointegra.api.resource;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.institutointegra.api.dto.ClientDto;
import br.com.institutointegra.api.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientResource  {

	@Autowired
	private ClientService clientService;
	
	//utilizando o rest templates
	//@PostMapping("/")
	//public ClientDto save(@RequestBody ClientDto dto) {
	//	return this.clientService.save(dto);
	//}
	
	@PostMapping("/")
	public ClientDto saveFeing(@RequestBody ClientDto dto) {
		return this.clientService.saveFeign(dto);
	}
	
	@GetMapping("/")
	public List<ClientDto> getAll() {
		return this.clientService.getAll();
	}
	
	@GetMapping("/viewPortClient")
	public Map<String,String> viewPort(){
		return this.clientService.viewPort();
	}
	
	
}
