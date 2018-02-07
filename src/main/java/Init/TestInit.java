/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;

import com.gydo194.animalkingdom.Zoo;
import com.gydo194.animalkingdom.animals.mammals.Human;
import com.gydo194.animalkingdom.genders.Female;
import com.gydo194.animalkingdom.genders.Male;

/**
 *
 * @author gydo194
 */
public class TestInit {

    public static void main(String[] args) {
        // Zoo i = Zoo.getInstance();

        //Human h = new Human("human", "white", 1);
        // Cage humanCage = new Cage();
        //humanCage.addAnimal(h);
        //debug
        // System.out.println("humanCage.getCageType() = " + humanCage.getCageType());
        //i.addCage(humanCage);
        // i.addAnimal(h);
        // i.test();
        // i.getCage("Human").getAnimal(0).
        //marriage unit test
        /*
       Human f = new Human("femaleHuman", "white", 0);
       
       
        System.out.println( h.marry(f));
       
        System.out.println(h.isMarried());
        System.out.println(f.isMarried());
        
        
        System.out.println("doing divorce");
        
        h.divorce();
        System.out.println("done divorce");
        
        System.out.println(h.isMarried());
        System.out.println(f.isMarried());
         */
 /*
        //propagation unit test
        //note the OvulationThread is commented out in the Female constructor!
        Human fh = new Human("femaleHuman", "white", 70);
        Female f = new Female();
        fh.setMaxNumberOfEggs(2);
        fh.setGender(f);
        f.setGenderOwner(fh);
        
        Human mh = new Human("maleHuman","white",80);
        Male m = new Male();
        mh.setMaxNumberOfEggs(2);
        mh.setGender(m);
        m.setGenderOwner(mh);
        
        
        mh.marry(fh);
        
        f.ovulate();
        
        mh.propagate(fh);
        
        
        
        
        System.out.println("doing insemination check");
        for (Egg i : fh.giveBirth()) {
            System.out.println(i.isInseminated());
            //System.out.println();
        }
        System.out.println("insemination check done");
        //end propagation unit test
         */
 /*
        //bird egg hatching unit test
        Parrot p = new Parrot("name", "color");
        
        Parrot l = new Parrot("f", "RaInBoW");
        
        Male m = new Male();
        
        Female f = new Female();
       
        l.setMaxNumberOfEggs(4);
        
        p.setGender(m);
        l.setGender(f);
        m.setGenderOwner(p);
        f.setGenderOwner(l);
        
        f.ovulate();
        
        p.propagate(l);
        
        
        l.hatchEggs(l.giveBirth()); //this could be done inside the function defenition, that would let us omit the l.giveBirth()
        //end bird egg hatching unit test
         */
 /*
        //reptile egg hatching unit test 
        Crocodile mc = new Crocodile("male");
        Crocodile fc = new Crocodile("female");
        
        
        Male m = new Male();
        Female f = new Female();
        
        
        mc.setGender(m);
        fc.setGender(f);
        
        m.setGenderOwner(mc);
        f.setGenderOwner(fc);
        
        System.out.println("setting max eggs..");
        fc.setMaxNumberOfEggs(5);
        
        System.out.println("ovulating..");
        f.ovulate();
        
        
        System.out.println("propagating...");
        mc.propagate(fc);
        
        
        System.out.println("hatching..");
        fc.hatchEggs(fc.giveBirth());
        
        
        System.out.println("done");
         */
 /*
        //Cage by Species unit test [FAILED]: null pointer
        
        Zoo i = Zoo.getInstance();
        
        if(i == null) {
            System.err.println("zoo is null");
            System.exit(-1);
        }
        
        i.getAllAnimalsBySpecies(Human.class);
         */
        Human fh = new Human("femaleHuman", "white", 70);
        Female f = new Female();
        fh.setMaxNumberOfEggs(2);
        fh.setGender(f);
        f.setGenderOwner(fh);

        Human fh2 = new Human("femaleHuman2", "white", 70);
        Female f2 = new Female();
        fh2.setMaxNumberOfEggs(2);
        fh2.setGender(f2);
        f2.setGenderOwner(fh2);

        Human mh = new Human("maleHuman", "white", 80);
        Male m = new Male();
        mh.setMaxNumberOfEggs(2);
        mh.setGender(m);
        m.setGenderOwner(mh);

        mh.marry(fh);

        /*f*/
        mh.setBirthControl(true);

        mh.makeLove();
        fh.makeLove();

        mh.makeLove(fh);

        mh.makeLove(fh2);

    }
}
