package com.arif.hasnat.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BlogEntity {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String url;
	private String body;
	
	@OneToMany(mappedBy="blogEntity")
	private List<ItemEntity> itemEntity;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userEntity;
	
	public List<ItemEntity> getItemEntity() {
		return itemEntity;
	}
	public void setItemEntity(List<ItemEntity> itemEntity) {
		this.itemEntity = itemEntity;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "BlogEntity [id=" + id + ", name=" + name + ", url=" + url
				+ ", body=" + body + "]";
	}


}
