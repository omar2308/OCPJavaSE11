/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Omar
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Person> comp =  Comparator
                .comparing(Person::getNombre)
                .thenComparingInt(Person::getEdad).reversed();
        
        Comparator comp1 =  Comparator.naturalOrder();
        String[] str = {"A", "B"};
        //Arrays.sort(str, Comparator.naturalOrder());
    }
}

class Person{
    private int edad;
    private String nombre;

    public Person(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
