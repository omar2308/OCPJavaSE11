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
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Person> comp1 =  Comparator
                .comparing(Person::getNombre)
                .thenComparingInt(Person::getEdad);
        
        Comparator<Person> comp2 =  Comparator
                .comparing(Person::getNombre)
                .thenComparing(
                        Comparator.comparing(Person::getEdad)
                                .reversed());
        
        Comparator comp3 =  Comparator.naturalOrder();
        
        String[] str = {"A", "B"};
        List<Person> lista = Arrays.asList(
            new Person(20, "Jose"), 
                new Person(20, "Andre"), 
                new Person(30, "Miguel"),
                new Person(10, "Miguel"));
        Collections.sort(lista, comp2);
        System.out.println(lista);
        //Arrays.sort(str, Comparator.naturalOrder());
        System.out.println(0 + 'a');
        System.out.println(0 + 'A');
        System.out.println(0 + '1');
    }
}

class Generic<T>{
    public void algo(){
        var lista = new ArrayList<T>();
    }
    public static <T> void otro(){
        var lista = new ArrayList<T>();
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

    @Override
    public String toString() {
        return "Person{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
}
