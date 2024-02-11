/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Fayed
 */
@Repository public class StudentsDAO {
   @Autowired
    private JdbcTemplate jdbcTemplate;
   
  
   public List<Students> allstudents() {
	String sql = "SELECT* from students";
        RowMapper<Students> rowMapper = new StudentsRowMapper();
        return jdbcTemplate.query(sql, rowMapper);
}
}
   
   

