/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Meymunah
 */
public class blink implements Runnable {

    @Override
    public void run() {
        try{
            for(;;){
            scramblegame.jLabel7.setForeground(Color.red);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.BLUE);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.white);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.GREEN);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.PINK);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.ORANGE);
            Thread.sleep(600);
            scramblegame.jLabel7.setForeground(Color.BLACK);
            Thread.sleep(600);
               }
        }catch (Exception e){
        }
    }
    
}
