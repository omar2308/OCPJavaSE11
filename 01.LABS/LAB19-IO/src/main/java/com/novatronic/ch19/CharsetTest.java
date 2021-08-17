/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.nio.charset.Charset;

/**
 *
 * @author Omar
 */
public class CharsetTest {
    public static void main(String[] args) {
        Charset charset = Charset.defaultCharset();
        System.out.println("charset:" + charset);
        
        Charset char1 = Charset.forName("UTF-8");
        System.out.println("charset:" + char1);
        
        Charset.availableCharsets().entrySet().stream()
                .forEach(e -> System.out.println("key:" + e.getKey()));
    }
}
