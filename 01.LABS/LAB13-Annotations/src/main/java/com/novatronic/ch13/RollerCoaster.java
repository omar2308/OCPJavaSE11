/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author Omar
 */
//@ZooAttraction
public class RollerCoaster {

}

class Events {
    //@ZooAttraction int numPassengers;
    int numPassengers;
    @ZooAttraction String rideTrain() {
        //return (@ZooAttraction String)"Fun!";
        
        return "Fun!";
    }

    //@ZooAttraction Events(@ZooAttraction String description) {
    @ZooAttraction Events(String description) {
    }

}

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface ZooAttraction {
}
