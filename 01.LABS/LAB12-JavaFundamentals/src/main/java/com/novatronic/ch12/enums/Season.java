/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.enums;

/**
 *
 * @author Omar
 */
enum Season implements XX{
    SPRING("Low"){ public String getHours(){ return "10am-3pm";} }, 
    SUMMER("Medium"), 
    FALL("High"), 
    WINTER("Medium");
    
    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        System.out.println("begin:" + expectedVisitors);
        this.expectedVisitors = expectedVisitors;
    }
    
    public void printExpectedVisitors(){
        System.out.println(this.expectedVisitors);
    }
    
    //public abstract String getHours();
    public String getHours(){
        return "9am-5pm";
    }
    public void metodo(){}
}

interface XX{
    void metodo();
}

//enum Season2 extends Season{ SSS }


