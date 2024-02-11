package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class QuizzesDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;

  public List<Quizzes> allquiz() {
	String sql = "SELECT* from quizzes";
        RowMapper<Quizzes> rowMapper = new QuizzesRowMapper();
        return jdbcTemplate.query(sql, rowMapper);
    
    }
}