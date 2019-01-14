package org.domain.model;

import java.util.Collection;

import org.domain.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserCustomDetails implements UserDetails {

	private static final long serialVersionUID = 4675861717718242897L;

	private final User user;
	private final Collection<GrantedAuthority> authorities;

	public UserCustomDetails(User user, Collection<GrantedAuthority> authorities) {
		this.user = user;
		this.authorities = authorities;
	}

	public String getPassword() {
		return user.getPassword();
	}

	public String getUsername() {
		return user.getUsername();
	}

	public boolean isEnabled() {
		return user.getIsEnabled();
	}

	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public User getUser() {
		return user;
	}

}
