/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Omar
 */
public class ArraysMulti {
    public static void main(String[] args) {
        String [][][] rectangle = new String[3][][];   // Como minimo el primero
        
        System.out.println(Arrays.asList(rectangle));
        
        rectangle[0] = new String[2][];
        rectangle[1] = new String[2][];
        rectangle[2] = new String[2][];
        
        for (String[][] element : rectangle) {
            System.out.println(Arrays.asList(element));
        }
        
        rectangle[0][0] = new String[]{"a","b"};
        rectangle[0][1] = new String[]{"a","b"};
        
        for (String[][] element : rectangle) {
            System.out.println(Arrays.asList(element));
        }
        
        //System.out.println(Arrays.asList(rectangle));
    }
}
