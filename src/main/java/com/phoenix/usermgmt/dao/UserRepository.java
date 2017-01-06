package com.phoenix.usermgmt.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.phoenix.usermgmt.entities.User;

public interface UserRepository extends CrudRepository<User, Long>  {
	
	 List<User> findByLastName(String lastName);

}
