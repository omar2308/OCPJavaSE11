/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.eva;

/**
 *
 * @author Omar
 */
interface HasExoskeleton {
   double size = 2.0f;
   abstract int getNumberOfSections();
}
abstract class Insect implements HasExoskeleton {
   abstract int getNumberOfLegs();
}
/*
public class Beetle extends Insect {
   int getNumberOfLegs() { return 6; }
   int getNumberOfSections(int count) { return 1; }
}
*/
