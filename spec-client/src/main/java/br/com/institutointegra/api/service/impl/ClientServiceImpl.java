package br.com.institutointegra.api.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.institutointegra.api.ProxyRsClient;
import br.com.institutointegra.api.dto.ClientDto;
import br.com.institutointegra.api.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProxyRsClient proxyRsClient;
	
	//sem o feign, utilizando restTemlates..
	@Override
	public ClientDto save(ClientDto dto) {
		
		try {
			
			HttpHeaders headers = new HttpHeaders();
			
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			HttpEntity<ClientDto>  request = new HttpEntity<ClientDto>(dto, headers);
			
			ResponseEntity<ClientDto> entity = 
					restTemplate.postForEntity("http://localhost:8081/api/clients/", request, ClientDto.class);
			
			return entity.getBody();
			
			
		} catch (Exception e) {
			e.printStackTrace();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			                                                                                                    
			return null;
		}
		
	}

	@Override
	public ClientDto saveFeign(ClientDto clientDto) {
		return proxyRsClient.save(clientDto);
	}

	@Override
	public List<ClientDto> getAll() {
		return proxyRsClient.GetAll();
	}

	@Override
	public Map<String, String> viewPort() {
		return this.proxyRsClient.viewPort();
	}

}
