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
public class Responses {
 
    private int id;
   private String response;
   private int student;
    private int question;
    
    public Responses() {}
    
    public int getId() { return id; }
    public String getResponse() { return response; }
    public int getQuestion() { return question; }
    public int getStudent() { return student; }
   
    
    public void setId(int id) { this.id = id; }
    public void setResponse(String response) { this.response = response; }
    public void setQuestion(int question) { this.question = question; }
    public void setStudent( int student) { this.student = student; }
    
}
