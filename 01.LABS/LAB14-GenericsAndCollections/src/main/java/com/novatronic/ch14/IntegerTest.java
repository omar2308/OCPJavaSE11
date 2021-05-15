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
public class IntegerTest {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
    }
}
