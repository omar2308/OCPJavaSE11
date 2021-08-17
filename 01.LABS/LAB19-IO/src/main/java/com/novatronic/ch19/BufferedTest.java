/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Omar
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        //File file = new File("test.txt");
        //FileWriter fw = new FileWriter(file);
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt"))){
//            bw.write("Hola Mundo como estas.....12356");
//        }
        BufferedTest bt = new BufferedTest();
        //bt.readFile("test.txt");
        bt.readFile("test3.txt");
    }
    
    public void readFile(String name) throws IOException{
        try (var fix = new FileInputStream(name)){
            //printData(fix);
            readData(fix);
        } 
    }
    
    public void readData(InputStream is) throws IOException{
        System.out.println((char)is.read());
        if(is.markSupported()){
            System.out.println("Mark supported!!");
            is.mark(50);
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            is.reset(); //Exception si no esa soportado
        }
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        
    }
    
    public void printData(InputStream is) throws IOException{
        int b;
        StringBuilder data = new StringBuilder();
        while((b = is.read()) != -1){
            data.append((char)b);
            //System.out.println("b:" + (char)b);
        }
        System.out.println(data);
    }
    
}
