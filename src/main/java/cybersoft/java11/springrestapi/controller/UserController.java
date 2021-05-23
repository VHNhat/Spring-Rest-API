package cybersoft.java11.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cybersoft.java11.springrestapi.model.User;
import cybersoft.java11.springrestapi.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService _service;
	
	@GetMapping("/{username}/{reward}")
	@ResponseBody
	public Object getUserInfo(@PathVariable("username") String username
			, @PathVariable("reward") String reward) {
		System.out.println("----------------------------------------------");
		System.out.printf("Username received from client: %s\n", username);
		System.out.printf("Username received from client: %s\n", reward);
		return new User();
	}
	
	@GetMapping("")
	@ResponseBody
	public Object getUserDashboard(
			@RequestParam(value = "pageindex",defaultValue = "1", required = false) int pageIndex,
			@RequestParam(value = "pagesize" ,defaultValue = "20", required = false) int pageSize) {
		
		System.out.println("-------------------------------");
		System.out.printf("Page Index: %d\n", pageIndex);
		System.out.printf("Page Size: %d\n", pageSize);
		
		List<User> results = _service.findAll();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	@PostMapping("")
	@ResponseBody
	public Object addNewUser(@RequestBody User user) {
		
		User addedUser = _service.add(user);
		if(addedUser == null)
			return "Unable to add new user";
		
		return addedUser;
	}
	
	
}
