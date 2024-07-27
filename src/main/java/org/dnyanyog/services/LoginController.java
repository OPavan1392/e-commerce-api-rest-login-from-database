package org.dnyanyog.services;

import java.sql.SQLException;

import org.dnyanyog.controller.LoginServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login1")
	public String Login(@RequestBody org.dnyanyog.Login.Login data) throws SQLException {
				return new LoginServices().login(data);
	}

}
