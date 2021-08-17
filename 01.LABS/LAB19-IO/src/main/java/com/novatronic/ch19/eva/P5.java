/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19.eva;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class P5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Zebra zebraOut =new Zebra("Z", 20);
        System.out.println("zebra in:" + zebraOut);
        try(var out = new ObjectOutputStream(new FileOutputStream("zebra.txt"))){
            out.writeObject(zebraOut);
        }
        
        Zebra zebraIn = null;
        try(var in = new ObjectInputStream(new FileInputStream("zebra.txt"))){
            zebraIn = (Zebra)in.readObject();
        }
        System.out.println("zebra out:" + zebraIn);
    }
}

class Zebra implements Serializable {
    private String name;
    private transient int age = 3;
    private transient Object obj = new Object();
    private List<String> lista = new ArrayList<>();

    public Zebra(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("On Zebra constructor");
    }

    @Override
    public String toString() {
        return "Zebra{" + "name=" + name + ", age=" + age + ", obj=" + obj + ", lista=" + lista + '}';
    }
}