/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch04;

/**
 *
 * @author Omar
 */
public class SwitchTest {

    public static void main(String[] args) {
        int month = 2;
        switch (month) {
            case 1 | 2:
                System.out.print("January"); // NO COMPILA: 
        }
        System.out.println("--------------------");
        
        int dayOfWeek = 6;
        switch(dayOfWeek) {
          default:
            System.out.println("Weekday");
          //break;
          case 6:
            System.out.println("Otro");
          case 15:
            System.out.println("Sunday");
          case 4:
            System.out.println("Saturday");
          
        }
    }
    
    final int getCookies() { return 4; }
    void feedAnimals() {
       final int bananas = 2222;
       int apples = 2;
       short numberOfAnimals = 3;
       final int cookies = 5;
       final short xx = 3;
       final byte yy = 2;
       switch (numberOfAnimals) {
          case bananas:
              System.out.println("bananas");
          case xx:        // DOES NOT COMPILES
          case yy:  // DOES NOT COMPILE
          case cookies :      // DOES NOT COMPILE
          case 3 * 5 :        
       }
}

}
