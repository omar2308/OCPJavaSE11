/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

/**
 *
 * @author Omar
 */
public class LocalCategoryTest {

    public static void main(String[] args) {
        var spain = new Locale("es", "ES");
        System.out.println("spain:" + spain);
        var money = 1.23;
        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain, money);

        // Category DISPLAY
        Locale.setDefault(Category.DISPLAY, spain);
        printCurrency(spain, money);

        // Category FORMAT
        Locale.setDefault(new Locale("en", "US")); // Lo dejamos como el original
        Locale.setDefault(Category.FORMAT, spain);
        printCurrency(spain, money);
    }

    private static void printCurrency(Locale locale, double money) {
        System.out.println(
                NumberFormat.getCurrencyInstance().format(money)
                + " - "
                + locale.getDisplayLanguage()
                + " - "
                + locale.getDisplayCountry());
    }
}
