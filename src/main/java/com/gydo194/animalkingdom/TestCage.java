/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gydo194
 */
public class TestCage<V extends Animal> {
    private V t;
    private ArrayList<V> animals = new ArrayList<>();

    
    public String getCageType() {
        return t.getClass().getSimpleName();
    }
    
    public V selectAnimal() {
        return animals.get(new Random().nextInt(animals.size()+1));
    }
    
    public void addAnimal(V a) {
        animals.add(a);
    }
    
    public boolean hasAnimalAt(int index) {
        return animals.size() >= index;
    }
    
    public ArrayList<V> getAnimals() { return animals; }
    
    public V getAnimal(int index) {
        if(hasAnimalAt(index)) {
            //throw new Exception("Cage::getAnimal(): no such animal");
            return null;
        }
        return animals.get(index);
    }
   
}
