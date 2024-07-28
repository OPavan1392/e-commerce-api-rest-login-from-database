package org.dnyanyog.services;

import java.sql.SQLException;

import org.dnyanyog.DTO.LoginResponse;
import org.dnyanyog.controller.LoginServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login1")
	public LoginResponse Login(@RequestBody org.dnyanyog.DTO.LoginRequest data) throws SQLException {
				return new LoginServices().login(data);
	}

}
