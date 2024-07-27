package org.dnyanyog.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.Login.Login;
import org.dnyanyog.common.DBUtils;

public class LoginServices {
	public String login(Login data) throws SQLException {
		
		
		
		String query = "Select * from user where User_Fname ='"+data.user+"' && User_pass = '"+data.password+"'";
		ResultSet result = DBUtils.ExecuteSelectQuery(query);
	if (result.next()) {
			return "login Succefully from data";
	}else {
		return "Login Faild";
		
		
	}

}
}