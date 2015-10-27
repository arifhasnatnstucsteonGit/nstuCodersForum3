package com.arif.hasnat.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.Entity.RoleEntity;
import com.arif.hasnat.Entity.UserEntity;

public interface UserRepsitory extends JpaRepository<UserEntity,Long>{

}
