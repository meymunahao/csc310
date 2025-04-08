/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

/**
 *
 * @author Meymunah
 */

import java.io.File; //Import the File Class
import java.io.IOException; //Import the IOException class to handle errors

public class fileHandler {
    public static void main(String[] args){
        try{
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()){
                System.out.println("File created:" +myObj.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
        System.out.println("An error occured.");
        e.printStackTrace();
        }
    }
    
}
