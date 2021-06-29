/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

/**
 *
 * @author Omar
 */
public class RunnableTest {
    public static void main(String[] args) {
        Runnable sloth = () -> System.out.println("Hello World");
        Runnable snake = () -> {int i=10; i++;};
        Runnable beaver = () -> {return;};
        Runnable coyote = () -> {};
        
        Runnable dos = new CalculateAverages(null);
        
        //"";
//        Runnable capybara = () -> "";                 // DOES NOT COMPILE
//        Runnable Hippopotamus = () -> 5;              // DOES NOT COMPILE
//        Runnable emu = () -> {return new Object();};  // DOES NOT COMPILE
    }
}

class CalculateAverage implements Runnable {
   public void run() {
      // Define work here
   }
}

class CalculateAverages implements Runnable {
    private double[] scores;
    public CalculateAverages(double[] scores) {
      this.scores = scores;
   }
   public void run() {
      // Define work here that uses the scores object
   }
}
