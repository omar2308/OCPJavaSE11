/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Omar
 */
public class CollectionTest {

    public static void main(String[] args) {
        Collection<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        lista.forEach(System.out::println);
        
    }
}
