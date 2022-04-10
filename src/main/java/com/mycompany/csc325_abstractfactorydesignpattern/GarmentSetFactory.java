/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 * 
 * @author adam_solomon_home
 */
public interface GarmentSetFactory{/*I have created this interface to represent the concept of a garment factory for the garment simulator so that i can define it without giving it a concerte'
    Implementation because this interface is being implemeneted by mulitple factory classes in order to produce a garment set of each stlye of clothing 
    */
       Tops createTops();//here I am createing a method that can store objects that implement the Tops interface
       Pants createPants();//here I am createing a method that can store objects that implement the Pants interface
       Shoes createShoes();///here I am createing a method that can store objects that implement the Shoes interface
       // all of these mehtods will store clothing objects from the different style classes which implement there respective interface 
       //so that when the concerte factory classes implement this Garment Factory interface they can Override these methods to store each of There respective Clothing Style Objetcs 
       
}
