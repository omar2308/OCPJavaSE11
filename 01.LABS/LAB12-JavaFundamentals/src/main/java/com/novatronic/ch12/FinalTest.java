/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12;

/**
 *
 * @author Omar
 */
public class FinalTest {

    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        //giraffe = 10;
        final StringBuilder sb = new StringBuilder();
        sb.append("hola");
        
        //sb = new StringBuilder();
        
        System.out.println("sb:" + sb.toString());
        final long lemur;
        if (isWeekend) {
            lemur = 5;
        }
//        else {
//            lemur = 10;
//        }
        //giraffe = 3; // DOES NOT COMPILE
        //System.out.println(giraffe + " " + lemur); // DOES NOT COMPILE
    }
    
    public static void main(String[] args) {
        new FinalTest().printZooInfo(true);
    }
}
