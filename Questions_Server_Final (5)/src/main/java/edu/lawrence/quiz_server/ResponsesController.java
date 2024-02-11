/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;

import edu.lawrence.quiz_server.Responses;
import edu.lawrence.quiz_server.ResponsesDAO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fayed
 */
@RestController
@RequestMapping("/answers")
@CrossOrigin(origins="*")
public class ResponsesController {
 private ResponsesDAO responsesDAO;   


public ResponsesController(ResponsesDAO dao){
this.responsesDAO= dao;
}

@PostMapping()
public void postResponse(@RequestBody Responses responses){
    responsesDAO.save(responses);
}
}