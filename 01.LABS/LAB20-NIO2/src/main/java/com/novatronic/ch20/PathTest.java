/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Omar
 */
public class PathTest {
    public static void main(String[] args) throws URISyntaxException {
        Path path1 = Path.of(".");
        System.out.println("path:" + path1.toAbsolutePath());
        
        Path path2 = Path.of(".", "algo");
        System.out.println("path:" + path2);
        System.out.println("path.origin:" + path2.hashCode());
        Path path3 = path2.toAbsolutePath();
        System.out.println("path:" + path3);
        System.out.println("path.new:" + path3.hashCode());
        System.out.println("=?" + (path2 == path3));
        
        
        URI a =new URI("file:///D:/Dev/OCPJavaSE11/01.LABS/LAB20-NIO2/echo.txt");
        Path path4 = Path.of(a);
        System.out.println("path4: " + path4);
        
        Path path5 = Paths.get(".", "echo.txt");
        Path path6 = path5.getParent();
        System.out.println("path5:" + path5);
        System.out.println("path6:" + path6);
        System.out.println("path3.parent:" + path3);
        
        Path path7 = Paths.get("./none.txt");
        System.out.println("paht7:" + path7);
        
//        System.getProperties()
//                .entrySet()
//                .stream()
//                .forEach(x -> System.out.println(x.getKey() + " -> [" + x.getValue() + "]"));
        
        //NIO:
        //.
        //.. -> ../../../
    }
}
