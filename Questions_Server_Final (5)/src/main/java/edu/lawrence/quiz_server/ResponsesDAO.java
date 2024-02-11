/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fayed
 */
@Repository
public class ResponsesDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
  public void save(Responses responses){
      String sql = "INSERT INTO responses (id, student, question, response) values (?,?,?,?)";
      jdbcTemplate.update(sql,responses.getId(),responses.getStudent(),responses.getQuestion(), responses.getResponse());
      
  }

}
