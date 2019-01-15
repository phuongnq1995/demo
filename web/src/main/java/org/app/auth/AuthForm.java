package org.app.auth;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class AuthForm implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String username;
	@NotEmpty
	private String fullname;
	@NotEmpty
	private String password;
	@NotEmpty
	private String passwordConfirm;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

}
