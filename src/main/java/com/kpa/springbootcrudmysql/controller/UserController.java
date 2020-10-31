package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.User;
import com.kpa.springbootcrudmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

	@Autowired	private UserService userService;


	@GetMapping("/users")
	public String getCountries() {
		return "User";
	}


	//Modified method to Add a new user User
	@PostMapping(value="users/addNew")
	public RedirectView addNew(User user, RedirectAttributes redir) {

		userService.save(user);

		RedirectView  redirectView= new RedirectView("/login",true);

		redir.addFlashAttribute("message",	"You successfully registered! You can now login");

		return redirectView;
	}

	@GetMapping("/user")
	public String getUser(Model model) {
		List<User> userList = userService.getUser();
		model.addAttribute("user", userList);
		return "user";
	}

	@GetMapping("/laporanUser")
	public String getLaporanUser(Model model) {
		model.addAttribute("user", userService.getLaporanUser());
		return "laporanUser";
	}

	@PostMapping("/user/addNew")
	public String addNew(User user) {
		userService.save(user);
		return "redirect:/user";
	}

	@RequestMapping("/user/findById")
	@ResponseBody
	public Optional<User> findById(Integer id_user) {
	  return userService.findById(id_user);
	}

	@RequestMapping(value="/user/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(User user) {
		userService.save(user);
		return "redirect:/user";
	}

	@RequestMapping(value="/user/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_user) {
		userService.delete(id_user);
		return "redirect:/user";
	}

}
