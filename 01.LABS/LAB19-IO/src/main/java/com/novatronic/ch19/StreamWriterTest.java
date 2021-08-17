/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Omar
 */
public class StreamWriterTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //try (var fos = new FileOutputStream("test_out.txt", true)) {
        try (var fos = 
                new BufferedOutputStream(new FileOutputStream("test_out.txt"), 100)) {
            for (int i = 0; i < 20; i++) {
                fos.write('a' + i);
            }
            fos.write('\n');
            
        }
    }
}
