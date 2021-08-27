/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author Omar
 */
public class FilesRWTest {

    public static void main(String[] args) throws IOException {
        System.out.println("---------- BufferedReader");
        var path = Path.of("echo.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        }
        
        
        System.out.println("---------- writer");
        var list = List.of("Hola", "Mundo", "cruel");
        var pathw = Path.of("echow.txt");
        try (var writer = Files.newBufferedWriter(pathw, 
                StandardOpenOption.APPEND, StandardOpenOption.CREATE)){
            for (String line : list) {
                writer.write(line);
                writer.newLine();
            }
        }
        
        System.out.println("---------- read all lines");
        var pathlines = Path.of("echow.txt");
        //Lee todo el archivo en memoria
        final List<String> lines = Files.readAllLines(pathlines);
        lines.forEach(System.out::println);
    }
}
