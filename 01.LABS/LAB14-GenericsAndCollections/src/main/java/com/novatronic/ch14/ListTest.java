/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Omar
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        String [] arr = {"a", "b", "c"};
        System.out.println(Arrays.asList(arr));
        List<String> lista2 = Arrays.asList(arr);
        lista2.set(0, "d");
        System.out.println(Arrays.asList(arr));
        arr[0] = "x";
        System.out.println(Arrays.asList(arr));
        
        List<String> lista3 = List.of(arr);
        //lista3.set(0, "z");
        System.out.println(lista3);
        
        List<String> lista4 = List.copyOf(lista2);
        //lista4.set(0, "z");
        System.out.println(lista4);
        
        for (String elem : lista4) {
            System.out.println(elem);
        }
        
        Iterator<String> it = lista4.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        
    }
}
