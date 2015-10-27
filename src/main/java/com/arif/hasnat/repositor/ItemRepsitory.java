package com.arif.hasnat.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.Entity.ItemEntity;
import com.arif.hasnat.Entity.RoleEntity;

public interface ItemRepsitory extends JpaRepository<ItemEntity,Long>{

}
