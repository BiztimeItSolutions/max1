package com.beingjavaguys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beingjavaguys.dao.UserDao;
//import com.beingjavaguys.domain.City;
import com.beingjavaguys.domain.User;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public void addUser(User user) {
		userDao.saveUser(user);
	}

	public List<User> getUser() {
		return userDao.getUser();
	}

	

}
