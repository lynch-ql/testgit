package com.tsinghuabigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsinghuabigdata.model.User;

@Transactional
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,String>{
	
	@Query("select user from User where id = ?1")
	public User queryUserById(String id);
}
