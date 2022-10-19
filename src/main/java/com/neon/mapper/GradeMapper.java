/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.neon.bean.Grade;


/**
 * @author user364
 *
 */

	public class GradeMapper implements RowMapper<Grade>{
		@Override
		public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
			Grade grade = new Grade();
			grade.setGradeName(rs.getString("gradeName"));
		    return grade;
		}
	}