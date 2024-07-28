package org.dnyanyog.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.DTO.LoginRequest;
import org.dnyanyog.DTO.LoginResponse;
import org.dnyanyog.common.DBUtils;

public class LoginServices {
	public LoginResponse login(LoginRequest data) throws SQLException {
		
		
		LoginResponse response = new LoginResponse();

		String query = "Select * from user where User_Fname ='" + data.user + "' && User_pass = '" + data.password
				+ "'";
		ResultSet result = DBUtils.ExecuteSelectQuery(query);
		if (result.next()) {
			response.errorMesage= "000";
			response.message= "Succefully Login";

			return response;
		} else {
			response.errorMesage ="911";
			response.message="Login Faild";
			return response;

		}

	}
}