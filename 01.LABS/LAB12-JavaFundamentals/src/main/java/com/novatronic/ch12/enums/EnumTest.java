/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.enums;

/**
 *
 * @author Omar
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("xxxxx");
        Season s = Season.FALL;
        System.out.println(s);
        System.out.println(Season.SPRING);
        for(Season season: Season.values()){
            System.out.println(season.name() + "-" + season.ordinal());
        }
        
        Season a = Season.valueOf("SPRING");
        System.out.println("a:" + a);
        a.printExpectedVisitors();
        
        
        
    }
}
