/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13;

/**
 *
 * @author Omar
 */
public @interface Swimmer {
    int armLength = 10;
    String stroke();
    String name();
    String favoriteStroke() default "BackStroke";
}

//@Swimmer class Amphibian {}
//@Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {}
@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}
//@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {}
@Swimmer(stroke="", name="", favoriteStroke="") class Snake {}