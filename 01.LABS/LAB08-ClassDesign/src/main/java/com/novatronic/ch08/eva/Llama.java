/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.eva;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Llama {
   void friendly(List<String> laugh, Iterable<Short> s) {
       System.out.println("DDD");
   }
    public static void main(String[] args) {
      LLama2 llama = new LLama2();
      List<String> arr = new ArrayList<>();
      llama.friendly(arr, null);
    }
}

class LLama2 extends Llama{
    void friendly(ArrayList<String> laugh, Iterable<Short> s) {
        System.out.println("AAA");
    }
    void friendly(List<String> laugh, Iterable<Short> s) {
        System.out.println("BBB");
    }
}

