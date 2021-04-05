/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.ineer;

/**
 *
 * @author Omar
 */
public class Zoo {
    public interface Paper{
        public String getId();
    }
    private class Ticket implements Paper{
        private String serialNumber;
        public String getId(){ return serialNumber;}
    }
    
    public Ticket sellTicket(String serialNumber){
        var t = new Ticket();
        t.serialNumber = serialNumber;
        return t;
    }
}

class Avion{
    public void metodo(){
        //Ticket t = new Ticket();
    }
}
