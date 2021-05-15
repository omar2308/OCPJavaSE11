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
public class Elephant {
    @Injured("Legs") public void falldown(){}
    @Injured(value = "Legs") public int trip(){ return 0;};
    @Injured String injures[];
}

@interface Injured{
    String veterinarian() default "unassigned";
    String value() default "foot";
    int agge() default 1;
}
