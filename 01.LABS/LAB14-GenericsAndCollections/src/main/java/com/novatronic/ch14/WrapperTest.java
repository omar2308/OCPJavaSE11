/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class WrapperTest {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(2);
        int num0 = num.intValue();
        
        Double doub = Double.valueOf(3.0);
        
        
        int num1 = num;
        Integer num2 = 4;
        metodo(3);
        
        var lista = new ArrayList<Integer>();
        lista.add(4);
        int pos0 =lista.get(0);
        System.out.println("pos0]:" + pos0);
        lista.add(null);
        //int pos1 = lista.get(1);
        
        Integer int1 = 127;
        Integer int2 = 127;
        System.out.println(int1 == int2);
    }
    
    
    public static void metodo(double a){
        System.out.println("double");
    }
    public static void metodo(Integer a){
        System.out.println("Integer");
    }
    
}
