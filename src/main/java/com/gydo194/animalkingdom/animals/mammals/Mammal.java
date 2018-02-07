/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.mammals;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.Zoo;
import com.gydo194.animalkingdom.animals.animalInterfaces.IMammal;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public abstract class Mammal extends Animal implements IMammal {
    
    private ArrayList<Mammal> babies;
    
    public Mammal(String name, String color, double weight) {
        super(name,"skin",color,weight);
    }
    
    public void giveLiveBirth() {
        ArrayList<Egg> mammalEggs = giveBirth();
        
        for(Egg e : mammalEggs) {
            babies.add((Mammal)e.getEmbryo()); //probably gonna throw thousands of exceptions if it gets anything that is not a mammal but lets hope that doesnt happen
        }
        suckle();
    }
    
    public ArrayList<Mammal> getBabies() { return this.babies; }
    
    public void addBaby(Mammal baby) { this.babies.add(baby); }
    
    public void suckle() {
        for(Mammal m : babies) {
            Zoo.getInstance().addAnimal(m);
        }
    }
}
