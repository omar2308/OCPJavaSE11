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
public class StringTest {

    public static void main(String[] args) {
        //replaceTest();
        chainingTest();
    }

    public static void replaceTest() {
        String test = "animals";
        System.out.println(test.replace("im", "xy"));
        System.out.println(test.replace("s", "xy"));
        System.out.println(test.replace("zz", "xy"));
    }

    public static void chainingTest() {
        String start = "AniMaL   ";
        String trimmed = start.trim();                 // "AniMaL"
        String lowercase = trimmed.toLowerCase();      // "animal"
        String result = lowercase.replace('a', 'A');   // "AnimAl"
        System.out.println(result);
        System.out.println("start:'" + start + "'");

        System.out.println("------------");
        
        start = "AniMaL   "; 
        String results = start
                .trim()
                .toLowerCase()
                .replace('a', 'A');
        System.out.println(results);
        System.out.println("start:'" + start + "'");
    }
}
