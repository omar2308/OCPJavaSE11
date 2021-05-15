/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class UpperBoundedWildcardTest {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        call(lista);
        
        List<Object> lista2 = new ArrayList<>();
        lista2.add("a");
        lista2.add("b");
        //call(lista2);
    }
    
    public static void call(List<? extends Number> lista){
        for (Number number : lista) {
            System.out.println(number);
        }
        Number n = (Number)Double.valueOf(2.0);
        //lista.add(n);
    }
}
