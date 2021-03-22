/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.stat;

//import static com.novatronic.ch07.stat.Other.hola;
import static com.novatronic.ch07.stat.Other.*;
//static import com.novatronic.ch07.stat.Other.*;
/**
 *
 * @author Omar
 */
public class ClaseS {
    private static final int num;
    static{
        num = 5;
        System.out.println("Hola");
    }
    {
        //num = 5;
    }
    
    static{
        System.out.println("Hola2");
    }
    
    public static void main(String[] args) {
        hola();
    }
}
