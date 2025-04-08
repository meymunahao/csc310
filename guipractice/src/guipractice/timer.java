/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

import java.util.Date;

/**
 *
 * @author Meymunah
 */
public class timer implements Runnable{

    @Override
    public void run() {
        try{
            for(;;){
            scramblegame.jLabel7.setText(new Date().toString());
            Thread.sleep(10);
               }
        }catch (Exception e){
        }
    }
   
}
