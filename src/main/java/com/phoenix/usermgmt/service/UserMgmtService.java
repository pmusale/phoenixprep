package com.phoenix.usermgmt.service;


import java.util.List;
import com.phoenix.usermgmt.entities.User;

public interface UserMgmtService {
	public List<User> findUserByLastName(String lastName);

}
