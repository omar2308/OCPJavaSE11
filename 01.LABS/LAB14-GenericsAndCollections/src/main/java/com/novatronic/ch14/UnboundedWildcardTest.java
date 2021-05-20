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
public class UnboundedWildcardTest {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        print(lista);
        
        List<?> lista1 = new ArrayList<>();
        var lista2 = new ArrayList<>();  //S resuelve ArrayList<Object>
        
        //lista1.add("");
        lista2.add("");
    }
    
    //Asi es OK tambien
    //public static void print(List lista){
    public static void print(List<?> lista){
        for (Object object : lista) {
            System.out.println(object);
        }
        //lista.add("");
        //lista.clear(); Esto si es alido
    }
}
