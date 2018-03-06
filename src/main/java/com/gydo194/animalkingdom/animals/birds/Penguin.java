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
public class Penguin extends Bird {

    public Penguin() {
        super("DEFAULT PENGUIN NAME", "DEFAULT PENGUIN COLOR", 4);
        this.maxNumberOfEggs = 5;
    }

    
    
    
    public Penguin(String name) {
        super(name, "black 'n white", 3);
    }

    public String communicate() {
        return "pingu pingu pingu";
    }

   

    
    
}
