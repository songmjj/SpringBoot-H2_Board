package com.springbook.biz.User;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserController {
	
	@Autowired
	private UserRepository DAO;
	

	@PostMapping("/login.do")
	  public String signIn(String id, String password, HttpSession session) {
	      User user = DAO.findUser(id, password);
	      session.setAttribute("user", user);
	      System.out.println(session.getAttribute("user"));
	      if(user != null) {
	          return "index.jsp";
	      }
	      return "login.jsp";
	  }
	
	@PostMapping("createUser.do")
	  public String create(User user) {
		DAO.save(user);
	      return "index.jsp";
	      
	  }
	 
	 
	
	
}
