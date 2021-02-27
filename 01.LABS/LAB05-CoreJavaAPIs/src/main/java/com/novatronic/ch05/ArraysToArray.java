/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class ArraysToArray {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("mundo");
        Object[] arr = lista.toArray();
        print(arr);
        lista.set(0, "Dias");
        System.out.println(lista);
        print(arr);
        arr[0] = "Todos";
        System.out.println(lista);
        print(arr);
    }
    
    private static void print(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "->" + arr[i]);
        }
    }
    
}
