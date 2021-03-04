/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class ForEachTest {

    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        bunnies.forEach(b -> b = b.toUpperCase());
        System.out.println(bunnies);
        
        Map<String, Integer> bunnies2 = new HashMap<>();
        //bunnies2.forEach(action);
    }

}

class Alumno{
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
