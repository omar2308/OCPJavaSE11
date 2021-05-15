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
public @interface Panda {
    //Integer height();
    //String[][] generalInfo();
    Size size() default Size.SMALL;
    //Bear frinedlyBer();
    Exercise exercise() default @Exercise(hoursPerDay = 4);
}
enum Size {SMALL, MEDIUM, LARGE}
class Bear{}
