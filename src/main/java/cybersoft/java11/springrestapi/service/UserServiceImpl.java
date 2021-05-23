package cybersoft.java11.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.java11.springrestapi.model.User;
import cybersoft.java11.springrestapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository _repository;
	@Override
	public List<User> findAll() {
		
		return _repository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		
		return _repository.findByUsername(username);
	}

	@Override
	public User add(User user) {
		
		return _repository.add(user);
	}

}
