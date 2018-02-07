/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

import com.gydo194.animalkingdom.genders.Gender;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public abstract class Animal {
    protected String bodyCovering;
    protected String name;
    protected String color;
    protected double weight;
    public int maxNumberOfEggs;
    protected Gender gender;
    private ArrayList<Egg> eggs = new ArrayList<>();
 
    
    
   
    
    public String getName() { return this.name; }
    public Gender getGender() { return this.gender; }
    public ArrayList<Egg> getEggs() { return this.eggs; }
    
    
    public void setGender(Gender g) { this.gender = g; }
    public void setEggs(ArrayList<Egg> eggs) { this.eggs = eggs; }
    
    
    
    
    public abstract String communicate();
    public abstract String move();
    public void propagate(Animal a) {
        if(!this.getClass().equals(a.getClass())) {
            System.err.println("Animal::propagate(): animal type conflict!");
            return;
        }
        
        //gender::propagate
        //getGender().propagate(this, a);
        //a.getGender().propagate(this, a);
        Gender sg = getGender();
        if(sg == null) {System.err.println("Animal::propagate(): self gender eq null");return;}
        Gender ag = a.getGender();
        if(ag == null) {System.err.println("Animal::propagate(): partner gender eq null");return;}
        sg.propagate(this, a);
        ag.propagate(this, a);
        
        
    }
    
     public boolean isFemale() {
        return gender.isFemale();
    }
    
    /*
    public boolean isPregnant() {}
    public ArrayList<Egg> giveBirth() {}
    public boolean isFemale() {}
    */
    
    public Animal (String name, String bodycovering, String color, double weight) {
        this.bodyCovering = bodycovering;
        this.name = name;
        this.weight = weight;
        this.color = color;
        
        
        
        //automagically add ourself to the zoo's default instance
        Zoo.getInstance().addAnimal(this);
    }
    
    public void dumpInfo() {
        System.out.printf("Animal Information Dump:\nName: '%s'.\nBody Covering: '%s'.\nColor: '%s'\nWeight: '%f'\nEnd Animal Information Dump\n",this.name,this.bodyCovering,this.color,this.weight);
    }

    public String getBodyCovering() {
        return bodyCovering;
    }

    public void setBodyCovering(String bodyCovering) {
        this.bodyCovering = bodyCovering;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxNumberOfEggs() {
        return maxNumberOfEggs;
    }

    public void setMaxNumberOfEggs(int maxNumberOfEggs) {
        this.maxNumberOfEggs = maxNumberOfEggs;
    }
    
    public ArrayList<Egg> giveBirth() {
        return this.gender.giveBirth();
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
    
    
}
