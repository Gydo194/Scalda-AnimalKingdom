/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.mammals;

import com.gydo194.animalkingdom.Cage;

/**
 *
 * @author gydo194
 */
public class Elephant extends Mammal {

    protected int earSize;

    public Elephant() {
        super("DEFAULT ELEPHANT NAME", "gray", 570.1);
    }

    public Elephant(String name, int earSize) {
        super(name, "gray", 570.1);
        this.earSize = earSize;
    }

    @Override
    public void dumpInfo() {
        super.dumpInfo();
        System.out.printf("Elephant Extended Information Dump:\nEar size: '%d'\nEnd Elephant Extended Information Dump\n", this.earSize);
    }

    @Override
    public String communicate() {
        return "trumpet";
    }

    @Override
    public String move() {
        return "walk";
    }

    public static Cage getCage() {
        System.out.println("Elephant::getCage()");
        return null;
    }

}
