/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.mammals;

import com.gydo194.animalkingdom.Cage;
import com.gydo194.animalkingdom.Egg;
import com.gydo194.animalkingdom.genders.Gender;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gydo194
 */
public class Human extends Mammal {

    private boolean usesBirthControl;

    protected String lastName;
    protected String insertion;
    protected Human partner = null;

    //chance factors when cheacting
    private int stdChance = 50;
    private int caughtChance = 50;

    //default constructor (required for Egg::inseminate() to be able to build a new instance)
    public Human() {
        super("DEFAULT NAME", "DEFAULT COLOR", 0); //create something with no information; set it later
    }

    public Human(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public String communicate() {
        return "hello";
    }

    @Override
    public String move() {
        return "walk";
    }

    public void setBirthControl(boolean usesBirthControl) {
        this.usesBirthControl = usesBirthControl;
    }

    //marry/divorce
    public boolean marry(Human partner) {
        System.out.println("doing marriage check");
        if (isMarried()) {
            return false;
        }
        System.out.println("success\ndoing partner marriage check");
        if (partner.isMarried()) {
            return false;
        }
        System.out.println("succeeded.");
        this.partner = partner;
        //partner.marry(this); //will this work? else set partner.partner
        partner.partner = this;
        System.out.println("successfully married");
        return true;
    }

    public void divorce() {
        //remove partner link in the partner
//        this.partner.divorce(); //whoops inifinite loop causing stack overflow
        this.partner.partner = null;
        this.partner = null;
    }

    public boolean isMarried() {
        return this.partner != null;
    }

    //extended info dump
    @Override
    public void dumpInfo() {
        super.dumpInfo();
        System.out.printf("Human Extended Information Dump\nMarried: '%b'\nMarried to: '%s'.\nEnd Human Extended Information Dump\n", this.isMarried(), this.partner);
    }

    @Override
    public ArrayList<Egg> giveBirth() {
        return this.gender.giveBirth();
    }

    //Love making functions
    public void makeLove() {
        System.out.printf("Human '%s' making love with itself\n", name);
    }

    public void makeLove(Human partner) {
        if (partner == null) {
            //making love to itself
            System.out.printf("Human '%s' making love to itself", name);
            return;
        }

        if (partner.equals(this.partner)) {
            //fine
            System.out.printf("Human '%s' making love with either itself or its partner\n", name);
            //System.out.println(isMarried() ? "Human is married" : "Human isnt married");
            System.out.println(partner == this.partner ? "partner equals" : "partner not equals");
        } else {
            //STD chance
            //chance of getting caught
            adulteryLove(partner);

        }

        if (!usesBirthControl() && !partner.usesBirthControl()) {
            propagate(partner);

        }

    }

    private void marriageLove() {
        if (!isMarried()) {
            System.out.printf("Human '%s' cannot make marriage love because it isn't married.\n", name);
        }
    }

    private void adulteryLove(Human lover) {
        System.out.printf("Human '%s' making love with someone unknown\n", name);

        System.out.printf("Human '%s': STDchance inc 5\nHuman '%s': Caught chance inc 5\n", name, name);
        stdChance += 5; //inc the STD chance by 5%
        caughtChance += 5;

        if (new Random().nextInt(100) < caughtChance && isMarried()) {
            System.out.printf("Human '%s' cheated and was caught. Divorce incoming!!!!\n", name);
            divorce();
            return;
        }

        if (new Random().nextInt(100) < stdChance && !(usesBirthControl() || lover.usesBirthControl())) {
            System.out.printf("Human '%s' got STD... poor human!\n", name);
            return;
        }
    }

    private boolean usesBirthControl() {
        return usesBirthControl;
    }

}
