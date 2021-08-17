/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Omar
 */
public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        FileCopyTest fc = new FileCopyTest();
        fc.copy("test3.txt", "test4.txt");
    }
    
    public void copy(String from, String to) throws IOException{
        
        try( var in = new BufferedInputStream(new FileInputStream(from));
                var out = new BufferedOutputStream(new FileOutputStream(to))){
            int b;
            while((b = in.read()) != -1){
                out.write(b);
            }
        }
    }
    
    public void copy2(String from, String to) throws IOException{
        
        try( var in = new FileReader(from);
                var out = new FileWriter(to)){
            int b;
            while((b = in.read()) != -1){
                out.write(b);
            }
        }
    }
}
