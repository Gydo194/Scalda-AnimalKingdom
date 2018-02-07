/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.genders;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public class Male extends Gender {
    @Override
    public boolean isPregnant() {
        return false;
    }
    
    
    
    @Override
    public boolean isFemale() { return false; }
    
    @Override
    public boolean isMale() { return true; }
    
    @Override
    
    public boolean getPregnant() { return false; }
     
    @Override
    public ArrayList<Egg> giveBirth() {
        return new ArrayList<>();
    }
    
    public void propagate(Animal a, Animal b) {
        System.out.println("male::propagate() called");
        //cant do a lot more
        return;
    }
    
}
