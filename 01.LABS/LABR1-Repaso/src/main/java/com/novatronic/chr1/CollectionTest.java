/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Omar
 */
public class CollectionTest {

    public static void main(String[] args) {
        Comparator< Integer> c = (x, y) -> y - x;
        var ints = Arrays.asList(3, 1, 4);
        
        
        //List<CC> cc = new ArrayList<>();
        Collections.sort(ints, c);
        System.out.println(Collections.binarySearch(ints, 1));
    }
}

class Persona implements Comparable<Integer>{

    @Override
    public int compareTo(Integer arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

class CC implements Comparator<Integer>, Comparable<CC>{

    @Override
    public int compare(Integer x, Integer y) {
        return x-y;
    }

    @Override
    public int compareTo(CC arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
