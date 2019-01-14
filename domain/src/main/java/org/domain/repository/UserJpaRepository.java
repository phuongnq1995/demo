package org.domain.repository;

import org.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserJpaRepository extends JpaRepository<User, String>{

	@Query(value = "SELECT "+ 
			"	u.username as username, u.fullname as fullname," + 
			"	u.is_enabled as is_enabled," + 
			"	u.login_failure_count as login_failure_count," + 
			"	r.role_name as role_name," + 
			"	r.role_id   as role_id" + 
			"FROM m_user u" + 
			"LEFT JOIN m_user_role ur on u.username = ur.username" + 
			"LEFT JOIN m_role r on ur.role_id = r.role_id" + 
			"WHERE username = ?", 
		nativeQuery = true)
	User loadUserByUsername(String username);
}
