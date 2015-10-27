package com.arif.hasnat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arif.hasnat.Entity.UserEntity;
import com.arif.hasnat.repositor.UserRepsitory;

@Service
public class UserService {
	
	@Autowired
	public UserRepsitory userRepository;
	

	
	
	public List<UserEntity> findAll(){
		return userRepository.findAll();
		
		}
	
	public UserEntity findOne(Long id){
		
		return userRepository.findOne(id);
	}
	
	}
