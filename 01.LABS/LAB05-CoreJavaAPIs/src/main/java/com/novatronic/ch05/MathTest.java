/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Omar
 */
public class MathTest {

    public static void main(String[] args) {
        //int num = Math.round(2.3);
        int num = Math.round(2.3f);

        double sal = Math.random();
        System.out.println(sal);

        int aleatorio = (int) (10 * Math.random());
        System.out.println(aleatorio);

        String[] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names);
        var other = Arrays.asList(names);

        //8
        System.out.println("--------------");
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age);
        
        

    }
}
