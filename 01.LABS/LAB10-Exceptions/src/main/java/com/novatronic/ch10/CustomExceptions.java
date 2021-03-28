/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

/**
 *
 * @author Omar
 */
public class CustomExceptions {

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosedForLunch e) { // second catch block
            System.out.print("not today");
        } catch (ExhibitClosed e) { // second catch block
            System.out.print("not today");
        } catch (Exception e) { // second catch block
            System.out.print("not today");
        }
    }

    public void seeAnimal() {
    }

    public static void main(String[] args) {
        CustomExceptions ce = new CustomExceptions();
    }
}

class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}
