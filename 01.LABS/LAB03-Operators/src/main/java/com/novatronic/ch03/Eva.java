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
public class Eva {

    public static void main(String[] args) {
        int pig = (short) 4;
        //int x = pig++;
        //System.out.println("x:" + x);
        pig = pig++;
        //pig++;
        System.out.println("pig:" + pig);
        int y = 1;
        y = y + pig;
        System.out.println("y:" + y);
        long goat = (int) 2;
        //goat = (long)(goat - 1.0); implicatamente hay un cast a long
        goat -= 1.0;
        System.out.print(pig + " - " + goat);
    }
    
    public void pregunta10(){
        int b = 5;
        int c = (int)2.0 + 1;
        
        int  x = ++c + b;
        int  y = (int)c + b;
        
        int a = (2 + 5) + (int) (2.0 + 1);


    }
}
