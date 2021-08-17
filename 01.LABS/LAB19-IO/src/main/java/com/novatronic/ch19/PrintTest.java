/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Omar
 */
public class PrintTest {
    public static void main(String[] args) throws IOException {
        String filename = "dog.txt";
        try (var out = new PrintWriter(filename)){
            out.write(5);   //writer
            out.println(5);
            Dog dog = new Dog(2, "fido");
            out.write(dog.toString());
            out.println(dog);
            out.print("FIN");
        } 
    }
}

class Dog{
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", name=" + name + '}';
    }
    
}