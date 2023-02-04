package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.web.model.UserTab;
import com.web.repo.UserRepo;

@Service
@Profile(value={"local","dev","prod"})
public class UserService {

	@Autowired
	private UserRepo repo;
	public List<UserTab> getUser()
	{
		return repo.findAll();
	}
}