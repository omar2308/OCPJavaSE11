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
public class Ternary {

    public static void main(String[] args) {
        int owl = 5;
        long food = owl < 2 ? 3 : 4L;
        System.out.println(food); // 4

        //long zoo = owl < 2 ? 3 : "hola";
        System.out.println(owl < 2 ? 3.0 : "hola");

        int x = 4 > 6
                ? 3
                : 2 > 0
                        ? 1
                        : 2 > 0
                                ? 8
                                : 7;
        System.out.println("x:" + x);

        // Tener cuidado con la evaluación
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz);  // 2,1

    }
}
