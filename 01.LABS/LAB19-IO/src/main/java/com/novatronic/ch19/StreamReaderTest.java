/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Omar
 */
public class StreamReaderTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        byte[] bytes = new byte[20];
        int read = -1;
        try(InputStream fis = new BufferedInputStream(
                new FileInputStream("read_test.txt"))) {
            for(;fis.read(bytes)>0;){
                System.out.println("" + new String(bytes));
            }
        } 
    }
   
}
