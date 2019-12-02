package com.ust_global.retailermaintenancesystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust_global.retailermaintenancesystem.dto.ProductBean;
import com.ust_global.retailermaintenancesystem.dto.RetailerBean;
import com.ust_global.retailermaintenancesystem.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(int rId,String password, HttpServletRequest request) {
		RetailerBean bean = service.login(rId, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}
	
	@GetMapping("/createprofile")
	public String registerPage()
	{
		return "createprofile";
	}
	
	
	
	
	
	@PostMapping("/createprofile")
	public String register(RetailerBean bean,ModelMap map)
	{
		int check = service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg", "Registration done"
					+ " Successfully and ID is "+check);
		}else {
			map.addAttribute("msg", "Email already exist");
		}
		return "login";
	}//end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map, 
			@SessionAttribute(name = "bean", required = false) 
		RetailerBean bean )
	{
		if(bean==null) {
			map.addAttribute("msg", "Login First !!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home()
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home()
	
	@GetMapping("/search")
	public String search(@RequestParam("rId")int rId,
			ModelMap map) 
	{
		RetailerBean bean = service.search(rId);
		if(bean==null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}//end of search()
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
	}//end of logout
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}//end of changePassword()
	
	@PostMapping("/changepassword")
	public String changepassword(String password,
			String confirmpassword,
			@SessionAttribute(name = "bean")RetailerBean bean,
			ModelMap map)
	{
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getrId(), password);
			map.addAttribute("msg", "Password Changed");
		}else {
			map.addAttribute("msg", "Password not matching");
		}
		return "home";
	}
	
	@GetMapping("/amountPay")
	public String amountPay(@RequestParam("rId")int rId,
			ModelMap map) 
	{
		int bean = service.amountPayable(rId);
			map.addAttribute("bean", bean);
		return "home";
	}
	
	@GetMapping("/orders")
	public String a(@RequestParam("rId")int rId,
			ModelMap map) 
	{
		ProductBean bean = service.orders(rId);
		if(bean==null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}
}
