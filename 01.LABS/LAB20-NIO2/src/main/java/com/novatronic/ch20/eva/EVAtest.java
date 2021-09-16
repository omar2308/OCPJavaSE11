/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20.eva;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Omar
 */
public class EVAtest {
    public static void main(String[] args) throws IOException {
        Path from = Path.of("monkey.txt");
        Path to = Path.of("./animals");
        Files.move(from, to,
                LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.ATOMIC_MOVE);
    }
}
