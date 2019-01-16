package org.domain.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.domain.entity.Role;
import org.domain.entity.User;
import org.domain.model.UserCustomDetails;
import org.domain.model.UserModel;
import org.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userJpaRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userJpaRepository.findOne(username);
		UserModel u = userJpaRepository.loadUserByUsername(username);
		System.out.println("debug");
		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new UserCustomDetails(user, getAuthorities(user.getRoles()));
	}

	private Collection<GrantedAuthority> getAuthorities(Set<Role> roles) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		for (Role role : roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}
		return grantedAuthorities;
	}
}
