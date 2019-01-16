package org.domain.service;

import java.util.HashSet;
import java.util.Set;

import org.domain.entity.Role;
import org.domain.entity.User;
import org.domain.repository.RoleRepository;
import org.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	public void register(User user) {
		Role role = roleRepository.findOne(1L);
		Set<Role> roles = new HashSet<Role>();
		roles.add(role);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		// default
		user.setIsEnabled(true);
		user.setLoginFailureCount(0);
		user.setRoles(roles);
		// omitted
		userRepository.save(user);
	}
}
