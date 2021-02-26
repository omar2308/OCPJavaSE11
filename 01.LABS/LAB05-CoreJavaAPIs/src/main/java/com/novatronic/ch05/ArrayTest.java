/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers0;
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[]   {42, 55, 99};
        int[] numbers3 = {42, 55, 99};
        
        System.out.println(numbers1 instanceof Object);
        
        show(numbers1);
        show(numbers2);
        show(numbers3);
        
        System.out.println("----------");
        System.out.println(numbers2 == numbers3);
        System.out.println(numbers2.equals(numbers3));
        System.out.println(numbers1);
        //numbers1.equals(args) // --->  a == b
        
        System.out.println("-----------");
        String[] arr = new String[3];
        shows(arr);
    }
    
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("pos:" + i + ",val=" + array[i]);
        }
    }
    
    public static void shows(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("pos:" + i + ",val=" + array[i]);
        }
    }
}
