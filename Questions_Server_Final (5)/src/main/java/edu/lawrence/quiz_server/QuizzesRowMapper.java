/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;

/**
 *
 * @author Fayed
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuizzesRowMapper implements RowMapper<Quizzes> {
	@Override
	public Quizzes mapRow(ResultSet row, int rowNum) throws SQLException {
		Quizzes quizzes = new Quizzes();
		quizzes.setId(row.getInt("id"));
                quizzes.setTitle(row.getString("title"));
                
                return quizzes;
	}
}
