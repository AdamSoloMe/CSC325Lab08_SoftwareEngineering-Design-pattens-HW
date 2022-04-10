/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author adam_solomon_home
 */
public class PartyShoes implements Shoes{ /*in this class I am Implementing the Shoes interface so that when I create objects from this class they will inherit the getShoestyle() method 
    and will Override it with the Implementation of being a Party shoe. Objects from this class will also Inherit the Charactersitics of Being a shoe*/
     @Override
      public void getShoeStyle(){//here I am Overiding the getShoeStyle Method from the Shoes Interface so that I can Specify which style of Shoes, Objects from this class will genererate for the garment Simulator
      //in this case Objects from this class will be party Styled Shoes
          System.out.println("These are Party Shoes");
      }
}