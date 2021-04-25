/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.util.Comparator;

/**
 *
 * @author Omar
 */
public class MethodREfTest {
    public static void main(String[] args) {
        B b = a -> System.out.println(a);
        B b1 = System.out::println;
        
        //Comparator.reverseOrder()
    }
}

interface B{
    void algo(int x);
}
