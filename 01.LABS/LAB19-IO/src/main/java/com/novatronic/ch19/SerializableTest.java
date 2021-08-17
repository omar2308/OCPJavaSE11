/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "cat.txt";
        SerializableTest st = new SerializableTest();
        Cat cat1 = new Cat("mini", 4,new Food("purina", 2));
        System.out.println("cat1:" + cat1);
        //Guardar el objeto
        st.saveObject(cat1, filename);
        
        //Leer el objeto
        Cat cat2 = (Cat)st.readObject(filename);
        System.out.println("cat2:" + cat2);
    }
    
    public void saveObject(Cat obj, String filename) throws IOException{
        try(var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)))){
            out.writeObject(obj);
            out.writeObject(obj.getFood().getMarca());
            out.writeObject(obj.getFood().getPeso());
        }
    }
    
    public Cat readObject(String filename) throws IOException, ClassNotFoundException{
        Cat obj = null;
        try(var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(filename)))){
            obj = (Cat)in.readObject();
            String marca = (String)in.readObject();
            int peso= (int)in.readObject();
            obj.setFood(new Food(marca, peso));
        }
        return obj;
    }
}

class Food {
    private String marca;
    private int peso;

    public Food(String marca, int peso) {
        this.marca = marca;
        this.peso = peso;
        System.out.println("en FOOD");
    }

    public String getMarca() {
        return marca;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Food{" + "marca=" + marca + ", peso=" + peso + '}';
    }
}

class Animal {
    protected transient int edad = 5;
    public Animal() {
        System.out.println("on Animal");
    }
    
}

class Cat extends Animal implements Serializable{
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private transient Food food;

    public Cat(String name, int age, Food food) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.edad =3;
        System.out.println("en CAT");
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", age=" + age + ", food=" + food + ", edad=" + edad + '}';
    }
    
}