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
public class ArrayBackedList {
    public static void main(String[] args) {
        String[] array = { "hawk", "robin" };
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        System.out.println(list);
        
        array[0] = "picaflor";
        System.out.println(list);
        //list.add("colibri");
        //list.remove(0);
        list.set(0, "colibri");
        System.out.println(list);
    }
}
