/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Product_SearchTest {

    File input = new File("exercise44_input.json");
    List<Products> products = Product_Search.productArrayMaker(input);


    String productSearchKey;



    @Test
    void productArrayMaker() {

        // expecting the second element (index 1) name to be: "Thing", "quantity": 5
        // checking to see if the data was successfully parsed using json file and stored into product array

        //expected values;
        String expectedName = "Thing";
        Double expectedPrice = 15.0;
        Integer expectedQuantity = 5;



        String actualName = products.get(1).name.toString();
        Integer actualQuantity = products.get(1).quantity;


        boolean result = (actualName.equals(expectedName) && expectedQuantity == actualQuantity);


        Assertions.assertTrue(result);






    }

    @Test
    void productFinder_true() {

        // expecting to get true if I enter a product that is in the list

        productSearchKey = "Widget";

        boolean actual = Product_Search.productFinder(products, productSearchKey);

        Assertions.assertTrue(actual);

    }

    @Test
    void productFinder_false() {

        // expecting to get false if I enter a product that is in not list

        productSearchKey = "iPad";

        boolean actual = Product_Search.productFinder(products, productSearchKey);

        Assertions.assertFalse(actual);

    }
}