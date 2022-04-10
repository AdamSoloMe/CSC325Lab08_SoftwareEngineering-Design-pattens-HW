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
public class CasualTops implements Tops{/* in this class I am Implementing the Tops interface so that when I create objects from this class they will inherit the getTopsStyle() method 
    and will Override it with the Implementation of being a Casual Top. Objects from this class will also Inherit the Charactersitics of Being a top 
    */
     @Override
     public void getTopsStyle(){//here I am Overiding the getTopsStyle Method from the Tops Interface so that I can Specify which style of Tops, Objects from this class will genererate for the garment Simulator
      //in this case Objects from this class will Casual Styled Tops
         System.out.println("These are Casual Tops");
     }
     
    
}
