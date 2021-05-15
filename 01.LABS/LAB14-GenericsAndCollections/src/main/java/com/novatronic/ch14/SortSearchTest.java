/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Omar
 */
public class SortSearchTest {
    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        Collections.sort(rabbits, Comparator.comparing(Rabbit::getAlumno));
        
        //Searching
        var names = Arrays.asList("Alberto", "Beto", "Lucho", "Miguel");
        int pos = Collections.binarySearch(names, "Carlos");
        System.out.println("pos:" + pos);
        
        Comparator<String> c = Comparator.reverseOrder();
        pos = Collections.binarySearch(names, "Lucho", c);
        System.out.println("pos:" + pos);
    }
}

class Rabbit{
    private int edad;
    private Alumno alumno;
    public int getEdad() {
        return edad;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
}


class Alumno implements Comparable<Alumno>{
    private int edad;

    @Override
    public int compareTo(Alumno arg0) {
        return 1;
    }
}