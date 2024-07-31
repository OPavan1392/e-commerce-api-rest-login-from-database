package org.dnyanyog.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.DTO.AddProductRequest;
import org.dnyanyog.DTO.AddProductResponse;
import org.dnyanyog.common.DBUtils;

public class AddProductService {
	
	public AddProductResponse addProductService(AddProductRequest addproductBody) throws SQLException {
		
		AddProductResponse responseaddproduct = new AddProductResponse();
		String queryAddProduct = "INSERT INTO product(product_name,quantity,price) values ('"+addproductBody.productName+"','"+addproductBody.productQuantity+"','"+addproductBody.productPrice+"')";
		DBUtils.ExecuteQuery(queryAddProduct);
		String selectqueryAddProduct= "Select * from product where product_name='"+addproductBody.productName+"'";
		
		ResultSet resultofProduct = DBUtils.ExecuteSelectQuery(selectqueryAddProduct);
		if (resultofProduct.next()) {
			responseaddproduct.errorMessageforProduct="000";
			responseaddproduct.messageforproductAdd="Product Added Succefully";
			return responseaddproduct;
		}else {
			responseaddproduct.errorMessageforProduct="999";
			responseaddproduct.messageforproductAdd="Product Added Failded";
			return responseaddproduct;

		}
		
		
		
	}

}
