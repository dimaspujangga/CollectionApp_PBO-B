/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dimas
 */
public class ListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> StudentList = new ArrayList<>();
        
        StudentList.add("Bima");
        StudentList.add("Kevin");
        StudentList.add("Vino");
        StudentList.add("Rendi");
        
        System.out.println("List Sebelum diedit");
        for(var value : StudentList){    
            System.out.println(value);
        }
        
        System.out.print("\n");
        StudentList.remove(2); 
        StudentList.add(1, "Rama"); 
        
        System.out.println("List Setelah diedit");
        for(var value : StudentList){
            System.out.println(value);
        }
        
        
    }
    
}
