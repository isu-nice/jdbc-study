package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao1;
import kr.or.connect.jdbcexam.dto.Role;

//SELECT
public class JDBCExam1 {

	public static void main(String[] args) {
		RoleDao1 dao = new RoleDao1();
		Role role = dao.getRole(100);
		System.out.println(role);
	}

}