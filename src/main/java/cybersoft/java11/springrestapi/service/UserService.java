package cybersoft.java11.springrestapi.service;

import java.util.List;

import cybersoft.java11.springrestapi.model.User;

public interface UserService {
	List<User> findAll();
	User findByUsername(String username);
	User add(User user);
}
