/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

import java.util.Properties;

/**
 *
 * @author Omar
 */
public class PropertieTest {
    public static void main(String[] args) {
        var prop = new Properties();
        prop.setProperty("name", "Dennys");
        
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.get("name"));
        System.out.println(prop.getOrDefault("namex", "Leo"));
        System.out.println(prop.getProperty("namex"));
        System.out.println(prop.getProperty("namex", "Leo"));
        
    }
}
