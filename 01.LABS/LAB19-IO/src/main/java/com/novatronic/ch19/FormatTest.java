/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Omar
 */
public class FormatTest {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "Pedro";
        int edad = 10;
        double peso = 40.25;
        System.out.format("Hello name:" + name + ", edad:" + 
                edad + ", peso:" + peso + "\n");
        System.out.format("Hello name:%s, edad:%d, peso: [%012.1f]%n", name, edad, peso);
        
        try (var out = new PrintStream("test_print.txt")){
            out.format("Hello name:%s, edad:%d, peso: [%012.1f]%n", name, edad, peso);
        } 
    }
}
