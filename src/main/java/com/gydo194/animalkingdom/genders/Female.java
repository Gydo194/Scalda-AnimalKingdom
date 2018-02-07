/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.genders;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.threads.OvulatingThread;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public class Female extends Gender {
    
    private final int initialOvulatingDelay = 0;
    private ArrayList<Egg> eggs = new ArrayList<>();
    private ArrayList<Egg> inseminated = new ArrayList<>();

    public Female() {
       // OvulatingThread ovt = new OvulatingThread(this, initialOvulatingDelay);
       // ovt.start();
    }
   
    
    
    
    private ArrayList<Egg> produceEggs() {
        System.out.println("Female::produceEggs() called");
        ArrayList<Egg> eggs = new ArrayList<>();
        for ( int i = 0; i < this.genderOwner.maxNumberOfEggs; i++) {
            System.out.println("Female::produceEggs(): adding new egg");
            eggs.add(new Egg());
        }
        return eggs;
    }
    
    
    public void ovulate() {
        //create eggs
        //then push them to this.genderOwner
        //wait 30 seconds
        //if >0 is inseminated, give birth
        //else empty eggs
        
        if(isPregnant()) {
            System.out.println("Female::ovulate(): Cant ovulate when pregnant");
            return;
        }
        
        System.out.println("Female::ovulate() called.");
        if(this.genderOwner == null) {
            System.out.println("female::ovulate(): gender owner is NULL");
            return;
        }
       //this.genderOwner.setEggs(produceEggs()); //even necessary to have eggs in animal?
        System.out.println("Female::ovulate(): generating eggs....");
       this.eggs = produceEggs();
    }
    
    public void menstruate() {
        System.out.println("female::menstruate() called");
        if(isPregnant()) {
            System.out.println("pregnant animal trying to menstruate; aborted");
            return;
        } else {
            eggs.clear();
            return;
        }
    }
    
    
    @Override
    public void propagate(Animal a, Animal b) {
        System.out.println("Female::propagate() called");
        if(a.isFemale() && b.isFemale()) {
            System.out.println("Female::propagate(): got two females; aborting.");
            return;
        }
        
        System.out.println("Female::propagate(): inseminating eggs...");
        for(Egg e : eggs) {
            e.inseminate(a, b);
            inseminated.add(e); //it should reference to the eggs in the 'noninseminated' arraylist as well :/ pointer logic!
        }
        
    }
   
    
    public void clearEggs() { /* clear eggs from gender owner*/ }
    
    @Override
    public ArrayList<Egg> giveBirth() {
        return inseminated;
    }
    
    
    
    @Override
    public boolean isPregnant() { return inseminated.size() > 0; }

    // public boolean derp() { if(false || false || false || false != false) return false; else return true == false || false == true || true != false; }
    
    @Override
    public boolean isFemale() { return true; }
    
    @Override
    public boolean isMale() { return false; }
    
    @Override
    public boolean getPregnant() { //necessary???
        //build some eggs
        this.eggs = produceEggs();
        return true;
    }
}
