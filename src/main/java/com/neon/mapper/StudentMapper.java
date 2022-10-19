/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Student;


/**
 * @author user364
 *
 */

	public class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			Student student = new Student();
			student.setFirstName(rs.getString("S_FirstName"));
			student.setLastName(rs.getString("S_LastName"));
			student.setMailId(rs.getString("S_Email"));
		    return student;
			
		}

	}

