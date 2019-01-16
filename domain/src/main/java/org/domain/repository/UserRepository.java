package org.domain.repository;

import org.domain.entity.User;
import org.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String>{

	@Query(nativeQuery=true)
	UserModel loadUserByUsername(@Param("username") String username);

}
