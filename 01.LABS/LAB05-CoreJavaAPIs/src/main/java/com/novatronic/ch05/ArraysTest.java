/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.Arrays;

/**
 *
 * @author Omar
 */
public class ArraysTest {

    public static void main(String[] args) {
        Integer[] num = {2, 6, 1};
        System.out.println(Arrays.asList(num));
        Arrays.sort(num);
        System.out.println(Arrays.asList(num));

        System.out.println("-------------");
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
        
        System.out.println("------------");
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2}));
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2,3}));
        System.out.println(Arrays.compare(new int[] {1,2,0}, new int[] {1,2}));
        System.out.println(Arrays.compare(new int[] {0,3,5,9}, new int[] {-2,3}));
        System.out.println(Arrays.compare(new int[] {0,3,5,9}, new int[] {5,3}));
        
        //Arrays.compare(new int[] {0,3,5,9}, new String[] {"5","3"});
        
        System.out.println("---------------");
        System.out.println("a:" + (0 + 'a') + ", 1:" + (0 + '1') + ",A:" 
                + (0 + 'A') + ", ñ:" + (0+ 'ñ'));
        System.out.println(Arrays.compare(new String[] {"1a", "bb"}, new String[] {"aa","bb"}));
    }
}
