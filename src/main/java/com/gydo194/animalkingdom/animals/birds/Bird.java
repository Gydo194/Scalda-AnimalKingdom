/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.birds;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.Zoo;
import com.gydo194.animalkingdom.animals.animalInterfaces.IBird;
import com.gydo194.animalkingdom.animals.animalInterfaces.IEggLayer;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public abstract class Bird extends Animal implements IBird, IEggLayer {
   public Bird(String name, String color,double weight) {
       super(name,"feathers",color,weight);
   }
   
   @Override
   public String move() { return "flap flap A bird flies"; }
   
   @Override
   public String fly() { System.out.println("Flying like a "+this.getClass().getSimpleName());return "";}
   
   @Override
   public ArrayList<Egg> layEggs() {
       return giveBirth();
   }
   
   @Override
   public void hatchEggs(ArrayList<Egg> layedEggs) {
       System.out.println("[DEBUG] Bird::hatchEggs() called.");
       for(Egg e : layedEggs) {
           System.out.println("[DEBUG] Bird::hatchEggs(): adding animal.");
           Zoo.getInstance().addAnimal(e.getEmbryo());
       }
   }
    
    
}