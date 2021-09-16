/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class DirectoryTest {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(".");
        basicList(path);
        System.out.println("----------------");
        System.out.println("size of " + path + "\n" + getPahtSize(path));
        
        find(path, 10);
        
        System.out.println("----------------");
        Path pathFile = Path.of("echo.txt");
        readLines(pathFile);
    }
    
    private static void basicList(Path path) throws IOException{
        try (Stream<Path> files = Files.list(path)){
            files.forEach(System.out::println);
        }
    }
    
    private static long getPahtSize(Path path) throws IOException{
        try(var s = Files.walk(path, 8, FileVisitOption.FOLLOW_LINKS)){
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .peek(System.out::println)
                    .mapToLong(DirectoryTest::getSize)
                    .sum();
        }
    }
    
    private static void find(Path path,long minSize) throws IOException{
        try(var s = Files.find(path,
                8, 
                (p, a) -> 
                        a.isRegularFile() && 
                        p.toString().endsWith("java") &&
                        a.size() > minSize)){
            s.forEach(System.out::println);
        }
    }
    
    private static long getSize(Path path){
        try {
            return Files.size(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }
    
    private static void readLines(Path path) throws IOException{
        try (var s = Files.lines(path)){
            s.forEach(System.out::println);
        } 
    }
}
