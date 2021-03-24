/**
 * 
 */
package com.haresh.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haresh.springcloud.model.Product;

/**
 * @author hudaysha
 *
 */
public interface ProductRepo extends JpaRepository<Product, Long> {

}
