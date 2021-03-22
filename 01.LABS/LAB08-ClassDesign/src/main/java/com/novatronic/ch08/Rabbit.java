/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08;

/**
 *
 * @author Omar
 */
public class Rabbit {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();          // Calls default constructor
        
        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        //Rabbit3 r3a = new Rabbit3();  //No existe
        Rabbit3 r3 = new Rabbit3(true);
        //Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE
        Rabbit4 r4a = Rabbit4.fromName("");
    }
}

class Rabbit1 {
}

class Rabbit2 {
    public Rabbit2() { }
}
class Rabbit3 {
    public Rabbit3(boolean b) { }
}
class Rabbit4 {
    private Rabbit4() { }
  
    public static Rabbit4 fromName(String name){
        return new Rabbit4();
    }
}

