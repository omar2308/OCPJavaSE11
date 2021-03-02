/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class TraditionalSearch {
    private static String hello = "Hello";
    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();  // list of animals
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));
    
    //int a = 4;
    int b = 4;
    //b = 5;    //Si cambia , no compila el lambda
    print(animals, a -> a.canHop());
    print(animals, a -> {return a.canSwim();});
    print(animals, a -> {
        System.out.println("hola " + hello + b);
        String x = "2";
        //b = 5;  //No es posible
        return a.canSwim();});
    //b = 4; // Si hago esto, el lambda no compila
   }
  private static void print(List<Animal> animals, CheckTrait checker) {
     for (Animal animal : animals) {
       if (checker.probar(animal))               // the general check
         System.out.print(animal + " ");
     }
     System.out.println();
   }
}

interface CheckTrait {
  boolean probar(Animal a);
  //int contar();  //No puedo agreagar otro metodo, porque deja de ser una
                   //interfaz funcional
}


class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;
  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }
   public boolean canHop() { return canHop; }
   public boolean canSwim() { return canSwim; }
   public String toString() { return species; }
}

