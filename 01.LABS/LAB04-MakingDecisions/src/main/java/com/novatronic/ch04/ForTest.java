/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch04;

/**
 *
 * @author Omar
 */
public class ForTest {

    public static void main(String[] args) {
        //for(int x = 0; true; x++);

        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x = value(), y = z + x) {
            System.out.print(y + " ");
        }
        System.out.print(x);
        

    }
    
    private static int value(){
        return 4;
    }
}
