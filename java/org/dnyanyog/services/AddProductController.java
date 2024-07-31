package org.dnyanyog.services;

import java.sql.SQLException;

import org.dnyanyog.DTO.AddProductRequest;
import org.dnyanyog.DTO.AddProductResponse;
import org.dnyanyog.controller.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
	@PostMapping("/AddProduct")
	public AddProductResponse AddProduct(@RequestBody AddProductRequest addproductBody) throws SQLException {
		return new AddProductService().addProductService(addproductBody);
	}

}
