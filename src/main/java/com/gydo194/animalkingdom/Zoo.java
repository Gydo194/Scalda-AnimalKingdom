/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author gydo194
 */
public class Zoo {

    private static HashMap<String, Zoo> instances = new HashMap<>();
    private String name;
    private HashMap<String, Cage> cages = new HashMap<>(); //fuck this shit, i'm out. Too much time wasted to crappy loops and null pointers. do it right this time.

    static {
        instances.put("default", new Zoo());
    }

    public Zoo() {
        //this.cages = new ArrayList<>();
    }

    public void addCage(Cage c) {
        if (c == null) {
            return;
        }
        if (c.getCageType() == "") {
            return;
        }
        cages.put(c.getCageType(), c);
    }

    public Cage getCage(String cageName) {
        if (!cages.containsKey(cageName)) //throw new Exception("Cage not found with name:"+cageName);
        {
            throw new UnsupportedOperationException("Cannot find cage");
        }
        return cages.get(cageName);
    }

    /*
    public ArrayList<Cage> getCages() {
        ArrayList<Cage> ar = new ArrayList<>();
        cages.entrySet().forEach(entr -> {
           ar.add(entr.getValue());
        });
    }
     */
    public static Zoo getInstance() {
        return getInstance("default");
    } //this should not loop :/

    public static Zoo getInstance(String name) {
        if (!instances.containsKey(name)) {
            instances.put(name, new Zoo());
        }
        return instances.get(name);
    }

    public Cage getCageOfAnimal(Animal a) {
        return getCageByRace(a.getClass());
    }

    /*
   public Cage getCageByRace(Animal a) {
       String anType = a.getClass().getSimpleName();
       System.out.println("AnimalType = " + anType);
       for (Cage c : getCages()) {
           String type = c.getCageType();
           System.out.println("CageType = " + type);
           //if(type == null ? anType == null : type.equals(anType)) //animal class representation as string
           if(type.equals(anType))
           {
               return c;
           }
       }
       System.out.println("cannot find cage :(");
       return null;
    }
     */
    public Cage getCageByRace(Class<? extends Animal> a) {
        if (!cages.containsKey(a.getSimpleName())) {
            addCageForRace(a);
        }
        return cages.get(a.getSimpleName());
    }

    public boolean hasCageForAnimal(Animal a) {
        return cages.containsKey(a.getClass().getSimpleName());
    }

    public boolean hasCageForRace(Class<? extends Animal> a) {
        return cages.containsKey(a.getSimpleName());
    }

    public void addCageForRace(Class<? extends Animal> a) {
        cages.put(a.getSimpleName(), new Cage());
    }

    public void addCageForAnimal(Animal a) {
        cages.put(a.getClass().getSimpleName(), new Cage());
    }

    public Cage getCageBySpecies(Class<? extends Animal> a) {
        return cages.get(a.getSimpleName());
    }

    public void addAnimal(Animal a) {
        /*
        String i = a.getClass().getSimpleName();
        System.out.printf("animal class simple name: '%s'.\n",i);
        Cage c = getCageOfAnimal(a);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        c.addAnimal(a);
         */
        if (!hasCageForAnimal(a)) {
            addCageForAnimal(a);
        }

        getCageOfAnimal(a).addAnimal(a);

    }

    public ArrayList<Animal> getAllAnimalsByRace(Class<? extends Animal> a) {
        return getCageByRace(a).getAnimals();
    }

    public ArrayList<Animal> getAllAnimalsBySpecies(Class<? extends Animal> a) {
        System.out.println("[DEBUG] Zoo::getAllAnimalsBySpecies(): called");
        if (a == null) {
            System.err.println("[ERROR] Zoo::getAllAnimalsBySpecies(): a is null");
            return null;
        }
        System.out.println("[DEBUG] Zoo::getAllAnimalsBySpecies(): superclass of current animal:" + a.getEnclosingClass().getSimpleName());
        return null;
    }

    public ArrayList<Animal> getAllAnimals() {
        ArrayList<Animal> ret = new ArrayList<>();
        //cages.entrySet().forEach(c -> {

        //});
        Iterator i = cages.entrySet().iterator();
        while (i.hasNext()) {
            Cage c = (Cage) i.next();
            for (Animal a : c.getAnimals()) {
                System.out.println("Zoo::getAllAnimals(): adding animal.");
                ret.add(a);
            }
        }
        return ret;
    }

}
