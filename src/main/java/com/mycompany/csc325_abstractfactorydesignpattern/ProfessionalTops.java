/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author adam_solomon_home
 */

public class ProfessionalTops implements Tops{/* in this class I am Implementing the Tops interface so that when I create objects from this class they will inherit the getTopsStyle() method 
    and will Override it with the Implementation of being a Professional Top. Objects from this class will also Inherit the Charactersitics of Being a top 
    */
     @Override
     public void getTopsStyle(){//here I am Overiding the getTopsStyle Method from the Tops Interface so that I can Specify which style of Tops, Objects from this class will genererate for the garment Simulator
      //in this case Objects from this class will Professional Styled Tops
         System.out.println("These are Professional Tops");
     }
     
    
}
