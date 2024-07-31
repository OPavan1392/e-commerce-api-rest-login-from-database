package org.dnyanyog.services;

import java.sql.SQLException;

import org.dnyanyog.DTO.AddUserRequest;
import org.dnyanyog.DTO.AddUserResponse;
import org.dnyanyog.controller.AddUserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	@PostMapping("/AddUser")
	public AddUserResponse AddUser(@RequestBody AddUserRequest LoginBodyuser) throws SQLException {
		return new AddUserServices().adduserServices(LoginBodyuser);
		
		
	}

}
