/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

/**
 *
 * @author Meymunah
 */
public class student {
    private String name;
    private int score;
    
    public student(String name){
         this.name = name;
         this.score = 0; 
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public void increaseScore(){
        this.score += 1;
    }
    
    public void resetScore(){
        this.score = 0;
    }
}
