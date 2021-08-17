/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Omar
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        //3 canales:
        //1. La salida estandar: out
        //2. La entrada estandar: in
        //3. La salidad de error: err
        System.out.println("Echo");
        System.err.println("Echo");
        //System.in.;
        
        //algo.sh 1> sal.out 2> err.out
        
        var reader = new BufferedReader(
            new InputStreamReader(System.in));
        
        //try (reader){}
        
        int a = reader.read();
        int b = reader.read();
        System.out.println("a:" + a + ",b:" + b);
        String input = reader.readLine();
        
        //try (var out = System.out){}
        System.out.println("Ingresaste:" + input);
    }
}
