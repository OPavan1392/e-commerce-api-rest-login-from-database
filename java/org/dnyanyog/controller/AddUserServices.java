package org.dnyanyog.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.DTO.AddUserRequest;
import org.dnyanyog.DTO.AddUserResponse;
import org.dnyanyog.common.DBUtils;

public class AddUserServices {

	public AddUserResponse adduserServices(AddUserRequest LoginBodyuser) throws SQLException {

		AddUserResponse addUserResponse = new AddUserResponse();
		String QueryAddUser = "insert into user( User_Fname, User_Lname, User_Gender, User_age, User_Email, User_pass, User_conpas) values('"
				+ LoginBodyuser.User_Fname + "','" + LoginBodyuser.User_Lname + "','" + LoginBodyuser.User_Gender
				+ "','" + LoginBodyuser.User_age + "','" + LoginBodyuser.User_Email + "','" + LoginBodyuser.User_pass
				+ "','" + LoginBodyuser.User_conpas + "')";
		DBUtils.ExecuteQuery(QueryAddUser);
		String SelectQuery = "Select * From user where User_Fname='"+LoginBodyuser.User_Fname+"'";
		ResultSet resultAddUser = DBUtils.ExecuteSelectQuery(SelectQuery);
				
				if (resultAddUser.next()) {
			addUserResponse.errorMesageofAddUser = "000";
			addUserResponse.messageofAdduser = "UserAdded Successfully";
			return addUserResponse;
		} else {
			addUserResponse.errorMesageofAddUser = "999";
			addUserResponse.messageofAdduser = "Failded";
			return addUserResponse;
		}
	}
}
