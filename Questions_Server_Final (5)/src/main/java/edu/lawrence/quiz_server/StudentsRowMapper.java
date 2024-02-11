package edu.lawrence.quiz_server;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

   
public class StudentsRowMapper implements RowMapper<Students> {
	@Override
	public Students mapRow(ResultSet row, int rowNum) throws SQLException {
		Students students = new Students();
		students.setId(row.getInt("id"));
                students.setName(row.getString("name"));
                
                return students;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fayed
 */

