/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.mammals;

import com.gydo194.animalkingdom.Cage;

/**
 *
 * @author gydo194
 */
public class Mouse extends Mammal {
    
    public Mouse() {
        super("DEFAULT MOUSE NAME", "DEFAULT MOUSE COLOR",0.2);
    }
    
    public Mouse(String name, String color) {
        super(name,color,0.2);
    }
    
    
    @Override
    public String communicate() { return "peep"; }
    @Override
    public String move() { return "walk"; }
    
    
    
   
    public static Cage getCage() {System.out.println("Mouse::getCage()");return null;}
}
