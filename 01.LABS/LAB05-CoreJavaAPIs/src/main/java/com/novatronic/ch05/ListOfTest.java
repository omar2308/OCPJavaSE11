/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.List;

/**
 *
 * @author Omar
 */
public class ListOfTest {
    public static void main(String[] args) {
        String[] arr = {"hola", "mundo"};
        List<String> holas = List.of(arr);
        System.out.println(holas);
        //holas.add("todos");
        //holas.set(0, "todos");
        arr[0] = "todos";
        print(arr);
        System.out.println(holas);
        
        
    }
    
    private static void print(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "->" + arr[i]);
        }
    }
}
