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

import br.com.institutointegra.api.model.OrderItem;
import br.com.institutointegra.api.service.OrderItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/orderItems")
@Api(value= "Order  Item API", description = "Operations to order item")
public class OrderItemResource {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping("/")
	@ApiOperation(value = "Get all order items")
	public List<OrderItem> getAll(){
		return this.orderItemService.getAll();
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Save order item")
	public OrderItem save(@RequestBody OrderItem orderItem) {
		return this.orderItemService.save(orderItem);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Update order item")
	public OrderItem update(
			@PathVariable(name = "id", required = false) Long id, 
			@RequestBody OrderItem orderItem
			) 
	{
		orderItem.setId(id);
		return this.orderItemService.save(orderItem);
	}
	
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Delete order item")
	public ResponseEntity delete(@PathVariable Long id ) {
	    this.orderItemService.delete(id);
	    return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Get order item")
	public OrderItem findById(@PathVariable Long id ) {
	    return this.orderItemService.findById(id);
	}
	
	
	
}
