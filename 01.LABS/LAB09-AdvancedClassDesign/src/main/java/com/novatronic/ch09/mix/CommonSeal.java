/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.mix;

/**
 *
 * @author Omar
 */
public class CommonSeal extends HarborSeal {

    public int getTailLength() { return 0;}

    public int getNumberOfWhiskers() { return 0; }
    
    public void cry(){}
    
    public void hello(){};
    
    public static void main(String[] args) {
        CommonSeal c = new CommonSeal();
        HasTail ht = new CommonSeal();
        HasWhiskers hw = new CommonSeal();
        HarborSeal hs = new CommonSeal();
        System.out.println(hs instanceof CommonSeal);
        System.out.println(hs instanceof HasTail);
        System.out.println(hs instanceof HasWhiskers);
        System.out.println(hs instanceof HarborSeal);
        
        System.out.println("----------");
        HasWhiskers hw1 = c;
        HasTail ht1 = c;
        HarborSeal hs1 = c;
        
        HarborSeal hs2 = (HarborSeal)hw1;
        
        System.out.println("----------");
        Integer i = 4;
        Short s = 4;
        //System.out.println(s instanceof Integer);
        System.out.println(ht instanceof HasWhiskers);
        
        Other ot = null;
        //Object obj1 = (String)ht; // Error de casting
        //Object obj2 = (HasWhiskers)""; // Error de casting
        Object obj2 = (Other)ht;   // el casting funciona
        System.out.println(ht instanceof Other);
        System.out.println(ot instanceof HasWhiskers);
        
        String st = ""; // String es Final y no hay linea de herencia
        OtherA ota = new OtherA();
        OtherB otb = new OtherB();
        OtherC otc = new OtherC();
        System.out.println(ota instanceof HasWhiskers);
        System.out.println(otb instanceof HasWhiskers);
        //System.out.println(otc instanceof HasWhiskers); //Error
    }
}

class OtherA{}
final class OtherB implements HasWhiskers{
    public int getNumberOfWhiskers(){ return 0;}
}
final class OtherC{}

interface Other{}

interface HasTail{
    public int getTailLength();
}

interface HasWhiskers{
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers{
    public abstract void cry();
}
