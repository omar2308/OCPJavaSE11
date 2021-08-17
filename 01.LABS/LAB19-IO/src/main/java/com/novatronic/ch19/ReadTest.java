/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Omar
 */
public class ReadTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("read_test.txt");
        BufferedReader br = new BufferedReader(fr, 50);
        br.lines().forEach(s -> System.out.println("line:" + s));
        
        /*
        char[] chars = new char[20];
        int cant = fr.read(chars);
        System.out.println("cant:" + cant);
        System.out.println("leido:" + new String(chars));
        Arrays.fill(chars, (char)0);
        cant = fr.read(chars);
        System.out.println("cant:" + cant);
        System.out.println("leido:" + new String(chars));
        Arrays.fill(chars, (char)0);
        cant = fr.read(chars);
        System.out.println("cant:" + cant);
        fr.close();
        */
    }
}
