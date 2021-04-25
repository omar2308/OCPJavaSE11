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
public abstract class OldEnum {
    public static final OldEnum PRIMERO = new OldEnum(){};
    public static final OldEnum SEGUNDO = new OldEnum(){};
    public static final OldEnum TERCERO = new OldEnum(){};
    
    private OldEnum(){}
}
