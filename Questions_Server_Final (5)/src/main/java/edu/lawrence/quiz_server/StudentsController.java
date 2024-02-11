/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.quiz_server;
import edu.lawrence.quiz_server.Students;
import edu.lawrence.quiz_server.StudentsDAO;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Fayed
 */@RestController
@RequestMapping("/students")
@CrossOrigin(origins="*")
public class StudentsController {
 private StudentsDAO studentsDAO;
 
 public StudentsController(StudentsDAO dao){
     this.studentsDAO = dao;
 }
 
 @GetMapping()
 public List<Students>allStudents(){
    
        return studentsDAO.allstudents();
    
}   
}
