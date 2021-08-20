/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author Omar
 */
public class FileTest {
    public static void main(String[] args) {
        String filename = "./echo_1.txt";
        File file = new File(filename);
        System.out.println("file:" +file);
        Path path = file.toPath();
        Path path1 = Path.of(filename);
        System.out.println("path:" + path);
        
        System.out.println("--------");
        System.out.println("file.parent:" + file.getParent());
        System.out.println("path.parent:" + path.getParent());
        System.out.println("path1.parent:" + path1.getParent());
        
        Path path2 = path1.toAbsolutePath();
        File file2 = file.getAbsoluteFile();
        System.out.println("file.parent:" + file2.getAbsolutePath());
        System.out.println("path.parent:" + path2.getParent());
    }
}
