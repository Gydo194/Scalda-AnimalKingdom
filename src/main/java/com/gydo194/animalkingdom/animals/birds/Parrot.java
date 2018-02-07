/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.birds;

import com.gydo194.animalkingdom.Egg;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public class Parrot extends Bird {

    
    public Parrot() {
        super("DEFAULT PARROT NAME", "DEFALT PARROT COLOR", 0.5);
    }
 
    public Parrot(String name, String color) {
        super(name, color, 0.2);

    }

    public String communicate() {
        return "[INFO] Parrot::communicate(): squeek";
    }

    
    
  
    
}
