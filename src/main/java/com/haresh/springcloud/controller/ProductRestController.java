/**
 * 
 */
package com.haresh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haresh.springcloud.model.Product;
import com.haresh.springcloud.repos.ProductRepo;

/**
 * @author hudaysha
 *
 */
@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		return repo.save(product);
	}
	
}
