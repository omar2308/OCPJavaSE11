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
@Team(3)
public class Equipo {
    
}
@Target(ElementType.TYPE)
@interface Team{
    int value() default 12;
}
