/**
 * 
 */
package com.rinil.demo.webstore.controller;

/**
 * @author rinilnath
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rinil.demo.webstore.domain.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/products")
	public String list(Model model) {

		model.addAttribute("product", productRepository.getAllProducts());

		return "products";
	}
}