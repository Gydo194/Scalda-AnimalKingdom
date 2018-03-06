/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.reptiles;

import com.gydo194.animalkingdom.Cage;

/**
 *
 * @author gydo194
 */
public class Snake extends Reptile {

    
     public Snake() {
        super("DEFAULT SNAKE NAME", "green", 2.5);
        this.maxNumberOfEggs = 7;
    }
    
    public Snake(String name) {
        super(name, "green", 2.5);
    }

    @Override
    public String communicate() {
        return "ssssss";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String crawl() {
        return "[INFO] Snake::crawl(): slither";
    }
}
