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
    public static void main(String[] args) {
        Path path = Path.of(".", "echo2.txt.lnk");
        System.out.println("existe:" + Files.exists(path, LinkOption.NOFOLLOW_LINKS));
        System.out.println("existe:" + Files.exists(path));
    }
    
    public static void copy(Path from, Path to) throws IOException{
        Files.move(from, to, StandardCopyOption.ATOMIC_MOVE);
    }
}
