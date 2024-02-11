/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;

import edu.lawrence.quiz_server.Quizzes;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fayed
 */
//interacts with the webpage
@RestController
@RequestMapping("/quizzes")
@CrossOrigin(origins="*")
public class QuizzesController {
    private QuizzesDAO quizzesDAO;

public QuizzesController(QuizzesDAO dao){
    this.quizzesDAO =dao;
}

    @GetMapping()
    public List<Quizzes> Allquiz(){
        return quizzesDAO.allquiz();
    
}   
}
