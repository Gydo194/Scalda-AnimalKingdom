/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author gydo194
 */
public class Egg {

//    private boolean isInseminated = false;
    private Animal parent0 = null;
    private Animal parent1 = null;

    private Animal embryo = null;

    public Egg() {
    }

    public Animal getParent0() {
        return parent0;
    }

    public Animal getParent1() {
        return parent1;
    }

    public Animal getEmbryo() {
        return embryo;
    }

    public void inseminate(Animal parent0, Animal parent1) {
        System.out.println("Egg::inseminate() called");
        this.parent0 = parent0;
        this.parent1 = parent1;
        try {

            //create new instance
            Constructor[] embConstructors = this.parent0.getClass().getDeclaredConstructors();
            Constructor c = null;
            Constructor embCons = null;

            for (int i = 0; i < embConstructors.length; i++) {
                //get the default (empty) constructor
                c = embConstructors[i];
                if (c.getGenericParameterTypes().length == 0) {
                    embCons = c;
                    break;
                }

            }

            if (embCons == null) {
                System.err.println("[ERROR] Egg::inseminate(): cannor create new animal of type '" + this.parent0.getClass().getSimpleName() + "'; reason: no default constructor found");
                return;
            }

            c.setAccessible(true);
            System.out.println("Egg::inseminate(): building new animal using constructor.newInstance()...");
            embryo = (Animal) c.newInstance();

        } catch (Exception e) {
            System.err.printf("Egg::inseminate(): cannot create new instance of '%s' :( ; aborting.\n", parent0.getClass().getSimpleName());
            e.printStackTrace();
        } finally {
            if (embryo == null) {
                System.err.println("Egg::inseminate():finally: embryo eq null");
                return;
            }
            //determine whether looks like parent 0 or 1
            if ((new Random()).nextBoolean()) {
//               embryo.setProperties(); //looks like parent 0
                embryo.setColor(parent0.getColor());
                embryo.setMaxNumberOfEggs(parent0.getMaxNumberOfEggs());
                embryo.setWeight(parent0.getWeight()); //the moment a baby weigs just as much as its parent
//                 embryo.setName() //random name
                embryo.setName(generateName());
            } else {
//                embryo.setProperties(); //looks like parent 1
                embryo.setColor(parent1.getColor());
                embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                embryo.setWeight(parent1.getWeight()); //again?
                embryo.setName(generateName());
            }
        }

    }

    public boolean isInseminated() {
        return embryo != null;
    }

    private String generateName() {
        ArrayList<String> names = new ArrayList<>();

        names.add("nullpointerexception");
        names.add("illegalstateexception");
        names.add("at life.java");
        names.add("line 404");
        names.add("line 418");
        names.add("at universe.java");
        names.add("objectdeathexception");
        names.add("at apple.java");
        names.add("at microsoft.java");
        names.add("victoryNotification");
        names.add("at linux.java");
        names.add("at openSource.java");
        names.add("at freesoftware.java");
        names.add("at linusTorvalds.java"); //i know linus said java is a horrible language
        names.add("null");
        names.add("nothing");
        names.add("");

        Collections.shuffle(names);
//        return names.get(0);
        String ret = names.get(0);
        System.out.printf("Egg::generateName(): generated '%s'.\n", ret);
        return ret;
    }

}
