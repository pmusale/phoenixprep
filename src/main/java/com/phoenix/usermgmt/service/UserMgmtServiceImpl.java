package com.phoenix.usermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenix.usermgmt.dao.UserRepository;
import com.phoenix.usermgmt.entities.User;

@Service
@Transactional
public class UserMgmtServiceImpl implements UserMgmtService{
	
	@Autowired 
	private UserRepository userrepository;
	
	public List<User> findUserByLastName(String lastName){
		return userrepository.findByLastName(lastName);
	}

}
