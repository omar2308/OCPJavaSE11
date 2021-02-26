/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        String[] strings = { "stringValue" };
        
        Object[] objects = new Object[4];
        objects[0] = "xx";
        objects[1] = strings;
        objects[2] = Integer.parseInt("0");
        shows(objects);
        
        strings[0] = "LaDennys";
        strings[1] = "LaPirata";  // Lanza exception
        //strings[2] = Integer.parseInt("0");
    }
    
    public static void shows(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("pos:" + i + ",val=" + array[i]);
        }
    }
}
