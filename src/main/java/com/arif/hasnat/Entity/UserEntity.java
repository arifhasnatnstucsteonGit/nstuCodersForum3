package com.arif.hasnat.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class UserEntity {
	
    @Id
    @GeneratedValue
	private Long id;
	private String name;																	
	private String email;
	private String password;
	
	@ManyToMany
	@JoinTable
	private List<RoleEntity> roleEntity;
	

	@OneToMany(mappedBy="userEntity")
	private List<BlogEntity> blogEntity;
	
	public List<BlogEntity> getBlogEntity() {
		return blogEntity;
	}

	public void setBlogEntity(List<BlogEntity> blogEntity) {
		this.blogEntity = blogEntity;
	}

	public List<RoleEntity> getRoleEntity() {
		return roleEntity;
	}

	public void setRoleEntity(List<RoleEntity> roleEntity) {
		this.roleEntity = roleEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
																				

}
