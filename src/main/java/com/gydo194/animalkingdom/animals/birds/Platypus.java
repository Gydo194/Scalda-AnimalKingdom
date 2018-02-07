/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.birds;

import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.animals.animalInterfaces.IBird;
import com.gydo194.animalkingdom.animals.animalInterfaces.IMammal;
import com.gydo194.animalkingdom.animals.animalInterfaces.IReptile;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public class Platypus extends Animal implements IBird, IMammal, IReptile { //?

    
    
    public Platypus() {
        super("DEFAULT PLATYPUS NAME","DEFAULT PLATYPUS BODYCOVERING (some kind of skin?)","DEFAULT PLATYPUS COLOR (brown)",0.25);
    }
    
    public Platypus(String name) {
        super(name, "skin", "brown", 2);
    }

    
    public void suckle() {
    } //overrides IMammal interface function

    @Override
    public String communicate() {
        return "undefined";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String fly() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return "Platypus::fly(): Is this thing supposed to be able to fly?";
    }

    @Override
    public String crawl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Egg> layEggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hatchEggs(ArrayList<Egg> layedEggs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
}
