package com.wjy.myspringbootdemo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.wjy.myspringbootdemo.models.User;


@Repository
public class UserDao
{
	@Resource
	private UserRepository userRepository;
	@Resource
	private JdbcTemplate jdbcTemplate;

	public User getById(final long id)
	{
		final String sql = "select * from Users where id=?";
		final RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

	public User findById(final long id)
	{
		return userRepository.findOne(id);
	}

	public void save(final User user)
	{
		userRepository.save(user);
	}

	public void update(final User user)
	{
		userRepository.save(user);
	}

	public void delete(final User user)
	{
		userRepository.delete(user);
	}

	public void delete(final long id)
	{
		userRepository.delete(id);
	}
}
