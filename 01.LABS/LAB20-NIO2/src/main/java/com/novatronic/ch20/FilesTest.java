/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Omar
 */
public class FilesTest {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(".", "echo2.txt.lnk");
        System.out.println("existe:" + Files.exists(path, LinkOption.NOFOLLOW_LINKS));
        System.out.println("existe:" + Files.exists(path));
        
        Path path1 = Path.of(".", "echo.txt");
        Path path2 = Path.of("echo.txt");
        System.out.println("sameFile?" + Files.isSameFile(path1, path2));
        
        System.out.println("------------ create directory");
        Path path3 =Path.of("algo01/algo02"); //Si existe algo01
        Path path3c = Files.createDirectory(path3);
        //si no existe, hay que usar createDirectories
        System.out.println("path3c:" + path3c);
    }
}
