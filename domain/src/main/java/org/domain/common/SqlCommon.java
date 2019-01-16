package org.domain.common;

public final class SqlCommon {

	public static final String LOAD_USER_BY_USERNAME = 
	
			"SELECT "+ 
			"	u.username as username, u.fullname as fullname," + 
			"	u.is_enabled as is_enabled," + 
			"	u.login_failure_count as login_failure_count," + 
			"	r.role_name as role_name," + 
			"	r.role_id   as role_id" + 
			"FROM m_user u" + 
			"LEFT JOIN m_user_role ur on u.username = ur.username" + 
			"LEFT JOIN m_role r on ur.role_id = r.role_id" + 
			"WHERE username = ?";
}
