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
		user.setId(111);
		user.setName("yuvraj");
		user.setType("user");
		user.setPassword("yuvraj666666");
		
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
	
	
		user = service.login(user);
		admin = service.login(admin);
		user.setName("rishab");
		user.setPassword("rishab99");
		
		System.out.println("Enter userId :" + admin);
		
		*/
		
	}
}