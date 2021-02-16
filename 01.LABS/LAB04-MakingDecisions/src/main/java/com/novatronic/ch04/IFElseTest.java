package com.novatronic.ch04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Omar
 */
public class IFElseTest {

    public static void main(String[] args) {
        int hourOfDay = 10;
        int z;
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
            z = 5;
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning");  // UNREACHABLE CODE
            z = 5;
        } else {
            System.out.println("Good Evening");
            z = 5;
        }
        System.out.println("z:" + z);
        
        int x;
        int y;
        if(true){
            y = 3;
        }else{
            x = 2;
        }
        //System.out.println("x:" + x);

    }
}
