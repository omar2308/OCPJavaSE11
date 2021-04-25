/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class TraditionalSearch {
    public static void main(String[] args) {

       // list of animals
       var animals = new ArrayList<Animal>();  
       animals.add(new Animal("fish",     false, true));
       animals.add(new Animal("kangaroo", true,  true));
       animals.add(new Animal("rabbit",   true,  false));
       animals.add(new Animal("turtle",   false, true));
     
       // Pass lambda that does check
       Predicate<Animal> checkHop = a -> a.canHop();
       Predicate<Animal> checkHop2 = (Animal a) -> { return a.canHop();};
       
       print(animals, checkHop);
       print(animals, a -> a.canSwim());
       print(animals, (Animal a) -> { return a.canHop();});
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
       for (Animal animal : animals) {
          if (checker.test(animal)) 
             System.out.print(animal + " ");
       }
    }
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
   public boolean canHop()  { return canHop; }
   public boolean canSwim() { return canSwim; }
   public String toString() { return species; }
}