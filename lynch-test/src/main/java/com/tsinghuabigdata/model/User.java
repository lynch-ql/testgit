package com.tsinghuabigdata.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="lynch_users")
public class User {
	
	@Id
	private String Id;//主键
	
	private String username;//用户名
	
	private String nickname;//昵称
	
	private String password;//密码
	
	private String salt;//密钥
	//使用0来表示False，1表示True
	private byte frozen = 0;//是否冻结
	
	private String email;
	
	private String role;
	
	public User() {
		super();
	}

	public User(String id, String username, String nickname, String password,
			String salt, byte frozen, String email, String role) {
		super();
		Id = id;
		this.username = username;
		this.nickname = nickname;
		this.password = password;
		this.salt = salt;
		this.frozen = frozen;
		this.email = email;
		this.role = role;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getFrozen() {
		return frozen;
	}

	public void setFrozen(byte frozen) {
		this.frozen = frozen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
