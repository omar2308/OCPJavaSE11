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
public class Unarios {

    public static void main(String[] args) {
        int parkAttendance = 0;
        System.out.println(parkAttendance);    // 0
        System.out.println(++parkAttendance);  // 1
        System.out.println(parkAttendance);    // 1
        System.out.println(parkAttendance--);  // 1
        System.out.println(parkAttendance);    // 0

        int a = 4;
        int b = ++a + a++;
        //5+5
        //a=5 -> a=6

        System.out.println("b:" + b);
        System.out.println("a:" + a);
        System.out.println("-------------");

        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);
        System.out.println("tiger is " + tiger);

    }
}
