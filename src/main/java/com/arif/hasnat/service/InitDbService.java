package com.arif.hasnat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arif.hasnat.Entity.BlogEntity;
import com.arif.hasnat.Entity.ItemEntity;
import com.arif.hasnat.Entity.RoleEntity;
import com.arif.hasnat.Entity.UserEntity;
import com.arif.hasnat.repositor.BlogRepsitory;
import com.arif.hasnat.repositor.ItemRepsitory;
import com.arif.hasnat.repositor.RoleRepsitory;
import com.arif.hasnat.repositor.UserRepsitory;
@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepsitory roleRepository;

	@Autowired
	private UserRepsitory userRepository;

	@Autowired
	private BlogRepsitory blogRepository;

	@Autowired
	private ItemRepsitory itemRepository;

	@PostConstruct
	public void init() {
		
			RoleEntity roleUser = new RoleEntity();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);

			RoleEntity roleAdmin = new RoleEntity();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);

			UserEntity userAdmin = new UserEntity();
            userAdmin.setName("admin");
            userAdmin.setEmail("arifhasnat.info@gmail.com");
			List<RoleEntity> roles = new ArrayList<RoleEntity>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userRepository.save(userAdmin);

			BlogEntity blogJavavids = new BlogEntity();
			blogJavavids.setName("JavaVids");
			blogJavavids.setUrl("http://feeds.feedburner.com/javavids?format=xml");
			blogJavavids.setBody("this the description  .");
			blogJavavids.setUserEntity(userAdmin);
			blogRepository.save(blogJavavids);
			
			
			ItemEntity item1 = new ItemEntity();
			item1.setBlog(blogJavavids);
			item1.setTitle("first");
			item1.setLink("http://www.javavids.com");
			item1.setPublishedDate(new Date());
			itemRepository.save(item1);
			
			ItemEntity item2 = new ItemEntity();
			item2.setBlog(blogJavavids);
			item2.setTitle("second");
			item2.setLink("http://www.javavids.com");
		    item2.setPublishedDate(new Date());
			itemRepository.save(item2);

		
	}

}