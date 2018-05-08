/**
 * 
 */
package com.rinil.demo.webstore.service.impl;

/**
 * @author rinilnath
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rinil.demo.webstore.domain.Product;
import com.rinil.demo.webstore.domain.repository.ProductRepository;
import com.rinil.demo.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void updateAllStock() {
		List<Product> allProducts = productRepository.getAllProducts();

		for (Product product : allProducts) {
			if (product.getUnitsInStock() < 500)
				productRepository.updateStock(product.getProductId(),
						product.getUnitsInStock() + 1000);
		}
	}
}