package com.cg.placement.client;

import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
//import com.cg.placement.service.IUserService;
//import com.cg.placement.service.UserServiceImpl;
import com.cg.placement.service.UserServiceImpl;

class client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		User user = new User();
				IUserService service = new UserServiceImpl();
		
				
		// Create
		user.setId(112);
		user.setName("manish");
		user.setType("user");
		user.setPassword("manish123");
		
		service.addUser(user);
		
		
		// Retrieve
		/*
		user	= service.searchUserById(102);
		System.out.println("ID is:"+user.getId());
		System.out.println("NAME is:"+user.getName());
		System.out.println("Type is:"+user.getType());
		
	*/	
		
		  
	/*
		
		// Update
		user	= service.updateUser(user);
		user.setId(100);
		user.setName("rohit");
		user.setPassword("rohit20");
		user.setType("admin");
		service.updateUser(user);
		System.out.println("Update is successful");
	
	*/
				
		
		
	}
}