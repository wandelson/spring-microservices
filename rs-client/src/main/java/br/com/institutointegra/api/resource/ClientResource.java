package br.com.institutointegra.api.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.institutointegra.api.model.Client;
import br.com.institutointegra.api.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/clients")
@Api(value= "Client API", description = "Operations to client")
public class ClientResource {
	
	
	@Value("${server.port}")
	private String port;

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/viewPort")
	public Map<String,String> viewPort(){
		Map<String,String> map = new HashMap<>();
		map.put("port", this.port);
		
		return map;
	}

	@GetMapping("/")
	@ApiOperation(value = "Get all clients")
	public List<Client> getAll(){
		return this.clientService.getAll();
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Create client")
	public Client save(@RequestBody Client client) {
		return this.clientService.save(client);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Update client")
	public Client update(
			@PathVariable(name = "id", required = false) Long id, 
			@RequestBody Client person
			)
	{
		person.setId(id);
		return this.clientService.update(person);
	}
	
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Delete client")
	public ResponseEntity delete(@PathVariable Long id ) {
	    this.clientService.delete(id);
	    return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Get client")
	public Client findById(@PathVariable Long id ) {
	    return this.clientService.findById(id);
	}
	
	
	
}