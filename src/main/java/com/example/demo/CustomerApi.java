package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customers")
public class CustomerApi {
	
	@Autowired
	private CustomerRepository repo;
	
	@RequestMapping("/")
	public Iterable<Customer> getAllCustomer() {
		return repo.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Customer> getCustomer(@PathVariable("id") int id) {
		return repo.findById(id);
	}
	
	@RequestMapping(value = "/Add",  method = RequestMethod.POST)
	public int addCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);	
		return customer.getId();
	}
	
	@RequestMapping(value = "/Update",  method = RequestMethod.PUT)
	public int updateCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer.getId();
	}
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.DELETE)
	public int deleteCustomer(@PathVariable("id") int id)
	{
		repo.deleteById(id);
		return id;
	}
}
