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
public class PartyGarmentFactory implements GarmentSetFactory  {//Here I am Creating the Party Styled Garment Factory concerte  class to Return a Clothing set of the Party Style
    @Override
    public Tops createTops(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Tops Clothing Object of the party Stlye
        return new PartyTops();//here Is where I Instantiate the Party Tops Clothing object
    }
    @Override
    public Pants createPants(){ //Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Pants Clothing Object of the Party Stlye
        return new PartyPants();//here Is where I Instantiate the Party pants Clothing object
    }
    @Override
    public Shoes createShoes(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Shoe Clothing Object of the Party Stlye
        return new PartyShoes();//here Is where I Instantiate the Party Shoe Clothing object
        
    }
    
}
