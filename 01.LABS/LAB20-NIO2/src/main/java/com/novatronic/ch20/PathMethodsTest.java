/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Omar
 */
public class PathMethodsTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        System.out.println("path:" + path);
        printNames(path);
        
        Path path1 = Paths.get(".").toAbsolutePath();
        System.out.println("path:" + path1);
        printNames(path1);
        
        System.out.println("----------");
        System.out.println("" + path1.subpath(0, 3));
        System.out.println("" + path1.subpath(1, 2));
        System.out.println("" + path1.subpath(1, 4));
        System.out.println("" + path1.subpath(0, path1.getNameCount()));
        
        System.out.println("-------- Info");
        Path path2 = Path.of("..", "..", "LAB20-NIO2");
        printPathInfo(path);
        printPathInfo(path1);
        printPathInfo(path2);
        
        System.out.println("----------- Resolve");
        Path path3 = Path.of("..", "..", "LAB20-NIO2");
        System.out.println("path3:" + path3);
        Path path4 = path3.resolve("test");
        System.out.println("path4:" + path4);
        
        System.out.println("-------- Relativize");
        Path path5 = Path.of("test.txt");
        Path path6 = Path.of("algo/test2.txt");
        System.out.println("path5:" + path5);
        System.out.println("path6:" + path6);
        System.out.println("path5.relativize.path6:" + path5.relativize(path6));
        System.out.println("path6.relativize.path5:" + path6.relativize(path5));
        
        System.out.println("--------- Normalize");
        Path path7 = Path.of("./test/../test3.txt");
        Path path8 = Path.of("test3.txt");
        System.out.println("path7:" + path7);
        System.out.println("path7.normalize:" + path7.normalize());
        System.out.println(path7.equals(path8));
        System.out.println(path7.normalize().equals(path8));
        
        System.out.println("------- Real Path");
        Path path9 = Path.of(".","path9.txt");
        Path path9_1 = Path.of(".","path9.txt");
        System.out.println(path9.toRealPath());
        System.out.println(path9.toRealPath(LinkOption.NOFOLLOW_LINKS));
        System.out.println("Ruta actual:" + Path.of(".").toRealPath()); //Sin punto
        System.out.println("Ruta actual:" + Path.of(".").toAbsolutePath());
    }
    
    private static void printNames(Path path){
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("" + i + "->" + path.getName(i));
        }
    }
    
    private static void printPathInfo(Path path){
        System.out.println("Path:" + path);
        System.out.println("Absolute:" + path.isAbsolute());
        System.out.println("Filename:" + path.getFileName());
        System.out.println("   Root:" + path.getRoot());
        walkParent(path);
    }
    
    private static void walkParent(Path path){
        Path currentPath = path;
        while( (currentPath = currentPath.getParent()) != null){
            System.out.println("   Currente Path:" + currentPath);
    }
    }
}
