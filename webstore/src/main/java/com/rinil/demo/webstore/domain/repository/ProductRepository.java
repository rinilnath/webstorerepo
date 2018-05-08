/**
 * 
 */
package com.rinil.demo.webstore.domain.repository;

/**
 * @author rinilnath
 *
 */

import java.util.List;

import com.rinil.demo.webstore.domain.Product;

public interface ProductRepository {

	List<Product> getAllProducts();

	void updateStock(String productId, long noOfUnits);
}