package com.accolite.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.accolite.dao.LoginDaoImpl;
import com.accolite.model.User;

@RestController
public class LoginController {

	private static final String LOGIN = "login";

	@Autowired
	LoginDaoImpl loginDao;

	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	 public ModelAndView showLogin() {
	 ModelAndView mav = new ModelAndView(LOGIN);
	 mav.addObject(LOGIN, new User());
	 return mav;
	 }

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public @ResponseBody User loginProcess(@ModelAttribute("login") User user, HttpServletResponse response) throws IOException {
		
		ModelAndView mav2 = null;
		User temp = loginDao.validateDetails(user);
		if (null != temp) {
			mav2 = new ModelAndView("welcome");
			mav2.addObject("username", temp.getUsername());
			mav2.addObject("location", temp.getLocationId());
			response.getWriter().print("success");
		} else {
			mav2 = new ModelAndView("login");
			mav2.addObject("message", "Username or Password is wrong!!");
		}
		
		// return mav.getModelMap();
		 return temp;
	}
}
