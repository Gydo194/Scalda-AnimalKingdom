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
public abstract class Gender {

    protected Animal genderOwner;

    public void setGenderOwner(Animal owner) {
        this.genderOwner = owner;
    }
    
    public void ovulate() {
        System.out.println("Gender::ovulate() called");
        ArrayList<Egg> eggsToPass = new ArrayList<>();
        for(int i = 0; i < this.genderOwner.maxNumberOfEggs; i++) {
           eggsToPass.add(new Egg()); //how about the insemination state now?
        }
        this.genderOwner.setEggs(eggsToPass); //now what they're in the Animal's container tough how are they gonna get inseminated?
        //now pregnancy will occur without insemination..
    }

    public  boolean isPregnant() {
        return this.genderOwner.getEggs().size() > 0;
    }
    
    public abstract boolean getPregnant();
    
    
    //public ArrayList<Egg> giveBirth() {return new ArrayList<Egg>();}
    public abstract ArrayList<Egg> giveBirth();
    
    public abstract boolean isFemale();
    public abstract boolean isMale();
    
    
    public abstract void propagate(Animal a, Animal b);
    
    

}
