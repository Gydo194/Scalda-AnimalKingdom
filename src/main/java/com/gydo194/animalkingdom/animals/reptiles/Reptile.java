/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.reptiles;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.Zoo;
import com.gydo194.animalkingdom.animals.animalInterfaces.IReptile;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public abstract class Reptile extends Animal implements IReptile {

    public Reptile(String name, String color, double weight) {
        super(name, "scales", color, weight);
    }

    @Override
    public ArrayList<Egg> layEggs() {
        return giveBirth();
    }

    public void hatchEggs(ArrayList<Egg> eggs) {
        //Cage reptCage = Zoo.getInstance().getCageOfAnimal(this);
        for (Egg e : eggs) {
            Zoo.getInstance().addAnimal(e.getEmbryo());
        }
    }

}
