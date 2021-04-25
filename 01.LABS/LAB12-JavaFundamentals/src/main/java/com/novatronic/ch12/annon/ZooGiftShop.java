/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.annon;

/**
 *
 * @author Omar
 */
public class ZooGiftShop {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }
    interface A{}
    interface B{}
    class C implements A, B{}
    public int admission(int basePrice){
        int x = 2;
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { 
                int y = x + 3;
                return 3; 
            }
        };
        //x = 3;
        return basePrice + sale.dollarsOff();
    }
    public void another(){
        SaleTodayOnly x = new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        };
        otro(x);
        otro(new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        });
    }
    public void otro(SaleTodayOnly a){
        
    }
    public static void main(String[] args) {
        ZooGiftShop z = new ZooGiftShop();
        SaleTodayOnly sale = z.new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        };
        z.otro(sale);
//        z.otro(new SaleTodayOnly() {
//            int dollarsOff() { return 3; }
//        });
    }
}
