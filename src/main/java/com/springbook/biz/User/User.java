package com.springbook.biz.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="Users")
public class User {
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name="password")
	private String password;
	private String name;
	private String role;
	
}
