/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

import java.awt.print.Paper;
/**
 * 
 * @author adam_solomon_home
 */
public class Application {
    //This is my Application Class to describe a Clothing item
    private Pants pants ;//here I am storing a pants Object from any of the pants clothing stlye objects which implement the pants interface
    private Tops tops;//here I am storing a tops Object from any of the tops clothing stlye objects which implement the tops interface
    private Shoes shoes;//here I am storing a tops Object from any of the pants clothing stlye objects which implement the tops interface

    public Application(GarmentSetFactory factory) {//this constructor takes in a Garmentfactory object as a parameter so that I can pass any Concerte Clothing stlye Garment factory which implemens the interface into the application 
        //can be passed into the application
       pants= factory.createPants();//depending on which Cltohing stlye factory is passed, this variable will store which stlye of pants the factory will create 
       tops = factory.createTops();////depending on which Cltohing stlye factory is passed, this variable will store which stlye of Tops the factory will create 
       shoes=factory.createShoes();//depending on which Cltohing stlye factory is passed, this variable will store which stlye of Shoes the factory will create 
    }
    
    public void revealContent(){//in this method I reveal the contents of the garment Set my Garment Simlutator has created 
        tops.getTopsStyle();
       pants.getPantsStyle();
       shoes.getShoeStyle();
    }
    
    
}
