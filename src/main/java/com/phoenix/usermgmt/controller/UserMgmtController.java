package com.phoenix.usermgmt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;

import com.phoenix.usermgmt.helper.UserDTO;
import com.phoenix.usermgmt.service.UserMgmtService;
import com.phoenix.usermgmt.entities.User;


@RestController
public class UserMgmtController {
	
	@Autowired
	private UserMgmtService userService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/usersbylastname")
    public List<UserDTO> findUserByLastName(@RequestParam(value="lastname", defaultValue="bauer") String name) {
    	
    	logger.info("Inside Find user" + name);
    	
    	List<UserDTO> userList = new ArrayList<UserDTO>();
    	
    	
    	ModelMapper modelMapper = new ModelMapper();
    	
    	UserDTO userDTO = null;
    	try{
	    	for (User user : userService.findUserByLastName(name)) {
	    		logger.info(user.toString());	
	    		userDTO = new UserDTO();
	    		modelMapper.map(user, userDTO);
	    		userList.add(userDTO);
	    		logger.info(user.toString());			
			} 
    	} catch (Exception e) {
    		logger.info("Inside exception"  );
    		throw new RuntimeException(e);
    	}
    	return userList;
    } 
}