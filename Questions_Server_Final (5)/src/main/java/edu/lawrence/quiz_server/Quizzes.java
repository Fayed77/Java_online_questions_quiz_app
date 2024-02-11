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
public class Quizzes {

    private int id;
  
    private String title;
    
    public Quizzes() {}
    
    public int getId() { return id; }
   
    public String getTitle() { return title; }
    
    public void setId(int id) { this.id = id; }
   
    public void setTitle(String title) { this.title = title; }    
}
