/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.reptiles;

import com.gydo194.animalkingdom.Cage;
import com.gydo194.animalkingdom.animals.reptiles.Reptile;

/**
 *
 * @author gydo194
 */
public class Crocodile extends Reptile {

    public Crocodile() {
        super("DEFAULT CROCODILE NAME", "DEFAULT CROCODILE COLOR", 200);
        this.maxNumberOfEggs = 7;
    }

    public Crocodile(String name) {
        super(name, "green", 50.1);
    }

    @Override
    public String communicate() {
        return "growl";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String crawl() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "[INFO] Crocodile::crawl(): crawling";
    }

}
