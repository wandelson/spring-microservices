package br.com.institutointegra.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.institutointegra.api.model.Order;
import br.com.institutointegra.api.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/orders")
@Api(value= "Order API", description = "Operations to order")
public class OrderResource {

	@Autowired
	private OrderService orderService;

	@GetMapping("/")
	@ApiOperation(value = "Get all orders")
	public List<Order> getAll(){
		return this.orderService.getAll();
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Save  order")
	public Order save(@RequestBody Order order) {
		return this.orderService.save(order);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Update  order")
	public Order update(@PathVariable(name = "id", required = false) Long id, @RequestBody Order order) {
		order.setId(id);
		return this.orderService.save(order);
	}
	
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Delete  order")
	public ResponseEntity delete(@PathVariable Long id ) {
	    this.orderService.delete(id);
	    return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Get  order")
	public Order findById(@PathVariable Long id ) {
	    return this.orderService.findById(id);
	}
	
	
	
}
