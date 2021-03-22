/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.overr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * public
 * protected
 * default
 * private
 * 
 * Exception
 * IOException
 * FileNotFoundException
 * @author Omar
 */
public class Wolf extends Canine{
     protected ArrayList<Number> getAverageWeight(List list) 
             throws IOException, NullPointerException{
         System.out.println("On Wolf");
        return new ArrayList<Number>();
    }
    
    public static void main(String[] args) throws IOException {
        Canine c = new Canine();
        Wolf w = new Wolf();
        System.out.println("c:" + c.getAverageWeight(null));
        System.out.println("w:" + w.getAverageWeight(null));
    }
}

class Canine {
    List<Integer> getAverageWeight(List<Number> list) throws IOException{
        System.out.println("On Canine");
        return new ArrayList<Integer>();
    }
    
    private int metodo(){
         return 4;
    }
}
