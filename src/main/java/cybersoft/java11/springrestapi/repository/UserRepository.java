package cybersoft.java11.springrestapi.repository;

import java.util.List;

import cybersoft.java11.springrestapi.model.User;

public interface UserRepository {
	List<User> findAll();
	User findByUsername(String username);
	User add(User user);
}
