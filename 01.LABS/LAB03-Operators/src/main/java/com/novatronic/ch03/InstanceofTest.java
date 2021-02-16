/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch03;

/**
 *
 * @author Omar
 */
public class InstanceofTest {

    public static void main(String[] args) {
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;
        
        Double x = Double.valueOf(4.0);
        Number numx = x;
        Object objx = x;
        
        System.out.println(numx instanceof Integer);  // false

        System.out.println(objx instanceof InstanceofTest); // false
        
        System.out.println(zooTime instanceof Integer);  // true
        System.out.println(zooTime instanceof Number);  // true
        System.out.println(zooTime instanceof Object);  // true
        System.out.println(num instanceof Integer);  // true
        System.out.println(num instanceof Number);  // true
        System.out.println(num instanceof Object);  // true
        System.out.println(obj instanceof Integer);  // true
        System.out.println(obj instanceof Number);  // true
        System.out.println(obj instanceof Object);  // true
        
        System.out.print(null instanceof Object);
        
        //System.out.print(null instanceof null);

    }
}
