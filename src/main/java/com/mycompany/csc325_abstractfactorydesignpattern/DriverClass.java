/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

import java.util.Scanner;
/**
 * 
 * @author adam_solomon_home
 */
public class DriverClass {
    //this is my Driver class to test the garment simluator 
    private static Application configureApplication(String garmentStyle) {//in this method I allow the user to Specifiy which configuration/ clothing stlye Garment set they would like the factory to produce 

        Application app; 
        GarmentSetFactory factory;

        if (garmentStyle.contains("Casual")) {//if the user selects casual the Application will produce a Casual Garment Set
            factory = new CasualGarmentFactory();//Here I am creating a new  garrment set From the Casual Garment facory class 
            app = new Application(factory);//then I am passing the garment set to the Application class so that a Casual garment set will be genertated
            return app;
        } else if (garmentStyle.contains("Professional")) {
            factory = new ProfessionalGarmentFactory();//Here I am creating a new  garrment set From the Professional Garment facory class 
            app = new Application(factory);//then I am passing the garment set to the Application class so that a professional garment set will be genertated
            return app;
        } else if (garmentStyle.contains("Party")) {
            factory = new PartyGarmentFactory();//Here I am creating a new  garrment set From the Party Garment facory class 
            app = new Application(factory);//then I am passing the garment set to the Application class so that a Partf garment set will be genertated
            return app;
        }
        return null;
       
    }

    public static void main(String[] args) {//this is my main method to run the application 
        System.out.println("what Garment Style are you intrested in? the options offered are Casual,Professional,Party");
        System.out.println("Please select which option you are intrested in:");
       Scanner getGarmentStyle= new Scanner(System.in);
        String mygarmentrequirements= getGarmentStyle.nextLine();
        Application app = configureApplication( mygarmentrequirements);
        System.out.println("Here is your Garment set:");
        System.out.println(" ");
        app.revealContent();
        System.out.println("These are the garments in a "+mygarmentrequirements+" set");
    }
}
