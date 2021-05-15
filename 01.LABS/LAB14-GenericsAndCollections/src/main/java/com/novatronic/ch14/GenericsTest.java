/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Omar
 */
public class GenericsTest {

    public static void main(String[] args) {
        List<Gato> lista = new ArrayList<>();
        lista.add(new Gato("Silvestre"));
        //lista.add(new Perro("Fido"));
        var felino = new Felino<Perro>();
        
        
        List<Felino<Gato>> felinos = new ArrayList<>();
        felinos.add(new Felino<Gato>());
        //felinos.add(new Felino<Perro>());
    }
}

class Felino<T>{
    private T felino;
    public T getFelino(){
        return felino;
    }
    public void setFelino(T felino){
        this.felino = felino;
    }
    
    public void addFelinos(List<Perro> felino){
    }
    
    //public void addFelinos(List<Gato> felino){    }
}

class Perro {
    private String name;
    public Perro(String name) {
        this.name = name;
    }
}

class Gato {
    private String name;
    public Gato(String name) {
        this.name = name;
    }
    
}
