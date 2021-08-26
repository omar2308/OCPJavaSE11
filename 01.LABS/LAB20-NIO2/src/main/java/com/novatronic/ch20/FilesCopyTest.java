/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Omar
 */
public class FilesCopyTest {
    public static void main(String[] args) throws IOException {
        Path path0 = Path.of("echo.txt");
        Path path1 = Path.of("echo_1.txt");
        //Files.copy(path1, path2); //Si ya existe -> error
        //en caso exista, usar REPLACE_EXISTING
        Files.copy(path0, path1, StandardCopyOption.REPLACE_EXISTING);
        
        Path path2 = Path.of("echo_2.txt");
        try (var is = new FileInputStream("echo.txt")){
            //Files.copy(is, path2); //Error si ya existe
            Files.copy(is, path2, StandardCopyOption.REPLACE_EXISTING);
        }
        
        var file = Paths.get("echo.txt");
        //var directory = Paths.get("algo01/echo.txt");
        var directory = Paths.get("algo01").resolve("echo.txt");
        Files.copy(file, directory, StandardCopyOption.REPLACE_EXISTING);
        
        
        //con move - ersto tb acuta como renombrado
        var filesource = Paths.get("algo01","echo.txt");
        var filedest = Paths.get("algo01", "algo02", "echo.txt");
        Files.move(filesource, filedest,
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.ATOMIC_MOVE);
        
        //00000000
        //10000000 -> 2^7 = 128 -> APPEND
        //00001000 -> 2^3 = 8   -> ATOMIC
        //APPEND | ATOMIC |...
        
        Files.createDirectory(Path.of("test01"));
        boolean result = Files.deleteIfExists(Path.of("test01"));
        System.out.println("result:" + result);
        
    }
    
    public static void copy(Path from, Path to) throws IOException{
        //Files.move(from, to, StandardCopyOption.ATOMIC_MOVE);
        
    }
}
