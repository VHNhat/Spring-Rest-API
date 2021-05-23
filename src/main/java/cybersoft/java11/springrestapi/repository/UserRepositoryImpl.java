package cybersoft.java11.springrestapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cybersoft.java11.springrestapi.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	List<User> userList;
	public UserRepositoryImpl() {
		userList = new ArrayList<User>();
	}
	@Override
	public List<User> findAll() {
		
		return userList;
	}

	@Override
	public User findByUsername(String username) {
		/*for(int i = 0; i < userList.size();i++) {
			if(userList.get(i).getUsername() == username) {
				User user = userList.get(i);
				return user;
			}
		}*/
		for(User user:userList) {
			if(username.equals(user.getUsername()))
				return user;
		}
		return null;
	}

	@Override
	public User add(User user) {
		userList.add(user);
		return user;
	}

}
