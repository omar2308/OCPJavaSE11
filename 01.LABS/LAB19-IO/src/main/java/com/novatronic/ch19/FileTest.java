/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Omar
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        File parent = new File("dirtest");
        boolean result = parent.mkdir();
        System.out.println("result:" + result);
        File file = new File(parent, "test.txt");
        System.out.println("parent: " + file.getParent());
        System.out.println("exist:?" + file.exists());
        
        File file2 = new File("test2.txt");
        System.out.println("parent: " + file2.getParent());
        //File file = new File("test.txt");

        result = file.createNewFile();
        System.out.println("result:" + result);
        System.out.println("parent: " + file.getParent());
        
        result = file2.createNewFile();
        System.out.println("result:" + result);
        System.out.println("parent: " + file2.getParent());
        
        for (File childfile : parent.listFiles()) {
            System.out.println("" + childfile.getName());
        }
        
        System.out.println("------------------");
        File dir = new File(".");
        for (File childfile : dir.listFiles()) {
            System.out.println("" + childfile.getAbsolutePath());
        }
        
        System.out.println(":" +System.getProperty("path.separator"));
        System.out.println(":" + File.pathSeparator);
        System.out.println(":" +System.getProperty("file.separator"));
        System.out.println(":" + File.separatorChar);
        
        System.out.println("temp.dir:" + System.getProperty("java.io.tmpdir"));
        System.out.println("home.dir:" + System.getProperty("user.home"));
        
    }
}
