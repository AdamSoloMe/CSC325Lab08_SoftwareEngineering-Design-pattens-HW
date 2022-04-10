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
public class ProfessionalGarmentFactory implements GarmentSetFactory  {//Here I am Creating the Professional Styled Garment Factory class  to Return a Clothing set of the Professional Style
    @Override
    public Tops createTops(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Tops Clothing Object of the Professional Stlye
        return new ProfessionalTops();//here Is where I Instantiate the Professional Tops Clothing object
    }
    @Override
    public Pants createPants(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Pants Clothing Object of the Professional Stlye
        return new ProfessionalPants();//here Is where I Instantiate the Professional Pants Clothing object
    }
    @Override
    public Shoes createShoes(){//Here I am Overriding the createTops from the Garemnt Factory interface so that I can Produce(create) a Shoe Clothing Object of the Professional Stlye
        return new ProfessionalShoes();//here Is where I Instantiate the Professional Shoe Clothing object
        
    }
    
}
