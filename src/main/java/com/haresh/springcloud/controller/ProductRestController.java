/**
 * 
 */
package com.haresh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.haresh.springcloud.dto.Coupon;
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
	private ProductRepo repo;
	
	@Autowired
	private RestTemplate restTemplate; 
	
	@Value("${couponService.getCouponUrl}")
	private String getCouponUrl;
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		
		Coupon coupon = restTemplate.getForObject(getCouponUrl + product.getCouponCode(), Coupon.class);
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
	}
	
}
