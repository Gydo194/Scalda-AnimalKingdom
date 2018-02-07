/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gydo194
 */
public class Cage {

    private ArrayList<Animal> cagedAnimals;
    
    public Cage() {
        this.cagedAnimals = new ArrayList<>();
        //automagically add ourself to the zoo's default instance
        Zoo.getInstance().addCage(this);
        
    }
    
    public String getCageType() {
        if (this.cagedAnimals.size() < 1) {
            return ""; //avoid nullpointer
        }
        return this.cagedAnimals.get(0).getClass().getSimpleName();
    }
    
    public Animal getAnimal(int index) {
        return this.cagedAnimals.get(index);
    }

    public void addAnimal(Animal a) {
        this.cagedAnimals.add(a);
    }

    public boolean hasAnimalAt(int index) {
        return this.cagedAnimals.size() >= index ? true : false;
    }

    public ArrayList<Animal> getAnimals() {
        return this.cagedAnimals;
    }    
    
}
