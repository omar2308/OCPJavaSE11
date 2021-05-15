/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

/**
 *
 * @author Omar
 */
public class GenericInterfaceTest {
    public static void main(String[] args) {
        ShippableRobot sr = new ShippableRobot();
        
        ShippableAbstrac<Robot, String> sa = new ShippableAbstrac<>();
    }
}

class ShippableRobot implements Shippable<Robot>{
    @Override
    public void ship(Robot t) {
    }
}

class ShippableAbstrac<T, U> implements Shippable<T>{
    private T name;
    private U lastname;
    private T[] names;
    @Override
    public void ship(T t) {
    }
    
    public void add(T[] t){
        
    }
}

class ShippableCrate implements Shippable{
    @Override
    public void ship(Object t) {
    }
    
}



class Robot{
}
        
interface Shippable<T>{
    void ship(T t);
}
