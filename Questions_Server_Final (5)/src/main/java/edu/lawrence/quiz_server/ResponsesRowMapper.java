/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Fayed
 */
public class ResponsesRowMapper implements RowMapper<Responses> {
    @Override 
    public Responses mapRow(ResultSet row, int rowNum) throws SQLException{
        Responses responses = new Responses();
        responses.setId(row.getInt("id"));
        responses.setStudent(row.getInt("student"));
        responses.setQuestion(row.getInt("question"));
        responses.setResponse(row.getString("response"));
        return responses;
    }
}
