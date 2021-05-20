/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author Omar
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> sp1 = () -> 4;
        int a = sp1.get();
        
        Supplier<StringBuilder> sp2 = StringBuilder::new;
        StringBuilder sb = sp2.get();
        System.out.println(sp2);
        
        Supplier<List<String>> sup3 = ArrayList<String>::new;
        
    }
}
