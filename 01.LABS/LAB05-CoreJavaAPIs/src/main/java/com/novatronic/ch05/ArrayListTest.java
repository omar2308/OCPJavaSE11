/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Omar
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("Hola");
        birds.add("Mundo");
        birds.add("Hola");
        birds.add("Pedro");
        System.out.println(birds);
        System.out.println(birds.remove("Hola"));
        System.out.println(birds);
        
        System.out.println("-----------------");
        List<Juan> juanes = new ArrayList<>();
        juanes.add(new Juan("1"));
        juanes.add(new Juan("2"));
        juanes.add(new Juan("1"));
        juanes.add(new Juan("3"));
        //Si no implementa el Objecto Juan equals, se compara por referencia
        System.out.println(juanes.remove(new Juan("1")));
        
    }
}

class Juan{
    private String name;

    public Juan(String name) {
        this.name = name;
    }
    
}
