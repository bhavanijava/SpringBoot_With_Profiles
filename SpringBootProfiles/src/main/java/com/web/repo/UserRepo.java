package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.UserTab;

@Repository
public interface UserRepo extends JpaRepository<UserTab, Integer> {

}