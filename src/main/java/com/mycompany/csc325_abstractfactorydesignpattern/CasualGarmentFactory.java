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
public class CasualGarmentFactory implements GarmentSetFactory  {//Here I am Creating the Casual Styled Garment Factory concerte  class  to Return a Clothing set of the Casual Style
    @Override
    public Tops createTops(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Tops Clothing Object of the Casual Stlye
        return new CasualTops();//here Is where I Instantiate the Casual Tops Clothing object
    }
    @Override
    public Pants createPants(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Pants Clothing Object of the Casual Stlye
        return  new CasualPants();//here Is where I Instantiate the Casual Pants Clothing object
    }
    @Override
    public Shoes createShoes(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Shoe Clothing Object of the Casual Stlye
        return new CasualShoes(); //here Is where I Instantiate the Casual Shoe Clothing object
        
    }
    
}
