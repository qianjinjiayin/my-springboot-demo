package com.wjy.myspringbootdemo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wjy.myspringbootdemo.dao.UserDao;
import com.wjy.myspringbootdemo.dao.UserRepository;
import com.wjy.myspringbootdemo.models.User;


@Service
public class UserService
{
	@Resource
	private UserRepository userRepository;

	@Resource
	private UserDao userDao;

	public User getUser(final long id)
	{
		return userDao.getById(id);
	}

	@Transactional
	public void save()
	{
		final User user = new User("WJY", "AC@COM");
		this.save(user);
	}

	@Transactional
	public void save(final User user)
	{
		userDao.save(user);
	}

	@Transactional
	public void update(final long id, final String name, final String email)
	{
		final User user = userDao.getById(id);
		user.setName(name);
		user.setEmail(email);
		userDao.update(user);
	}
}
