/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author adam_solomon_home
 */public class ProfessionalPants implements Pants{ /*in this class I am Implementing the Pants interface so that when I create objects from this class they will inherit the getPantsStyle() method 
    and will Override it with the Implementation of being a Professional Pants. Objects from this class will also Inherit the Charactersitics of Being pants.
    */
     @Override
      public void getPantsStyle(){//here I am Overiding the getPantsStyle Method from the Pants Interface so that I can Specify which style of Pants, Objects from this class will genererate for the garment Simulator
      //in this case Objects from this class will Professional Styled Pants
          System.out.println("These are Professional pants");
      }
}
     
     
    

