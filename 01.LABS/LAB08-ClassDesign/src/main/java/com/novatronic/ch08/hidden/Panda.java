/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.hidden;

/**
 *
 * @author Omar
 */
public class Panda extends Bear {
    public static void eat() {
        System.out.println("Bear eating");
    }
    
    /*
    public void sneeze(){
        this.sneeze();
    }
    
    public static void hibernate(){
        
    }
    */
    public static void main(String[] args) {
        eat();
        Panda p = new Panda();
        p.sneeze();
    }
}

class Bear {
    public static void eat() {
        System.out.println("Panda eating");
    }
    
    public static void sneeze(){
        System.out.println("Bear sneeze");
    }
    
    public void hibernate(){
        
    }
}
