/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;

import com.gydo194.animalkingdom.Zoo;
import com.gydo194.animalkingdom.animals.birds.Parrot;
import com.gydo194.animalkingdom.animals.mammals.AfricanElephant;
import com.gydo194.animalkingdom.animals.mammals.AsianElephant;
import com.gydo194.animalkingdom.animals.mammals.Human;
import com.gydo194.animalkingdom.animals.reptiles.Crocodile;
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
 /*
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

        
        mh.setBirthControl(true);

        mh.makeLove();
        fh.makeLove();

        mh.makeLove(fh);

        mh.makeLove(fh2);
         */
        /////////////////////////////////DETAILED UNIT TESTS 21-02-18////////////////////////////
        
        //build some animals
        
        
        //UE 001
        System.out.println("UE001");

        System.out.println("Human cage size:" + Zoo.getInstance().getCageByRace(Human.class).getAnimals().size());
        Human h = new Human("TestHuman", "orange", 80.0);
        System.out.println("Human cage size:" + Zoo.getInstance().getCageByRace(Human.class).getAnimals().size());

        //UE 002
        System.out.println("UE002");

        System.out.println(h.communicate());
        Parrot i = new Parrot("test parrot", "RaInBoW");
        System.out.println(i.communicate());
        
        AsianElephant ae = new AsianElephant("elefant");
        AfricanElephant afe = new AfricanElephant("africanelefant");
        
        System.out.println(ae.communicate());
        System.out.println(afe.communicate());
         
        

        //UE 003
        System.out.println("\n\n\n\nUE003");

        
        System.out.println(h.move());
        System.out.println("\tUS002");
        System.out.println(i.fly());
        System.out.println("\tUS003");
        System.out.println((new Crocodile("croc")).crawl());
        //US 004 marry
        Human f = new Human("femaleTestHuman", "puryellow", 80.1);
        System.out.println("fismarried:"+f.isMarried());
        f.marry(h);
        System.out.println("fismarried:"+f.isMarried());
        //US 005 divorce
        f.divorce();
        System.out.println("divorcing..");
        System.out.println("fismarried:"+f.isMarried());
        //UE004
        System.out.println("UE004");
        
        
        //propagate with other male
        System.out.println("Human cage contains: "+Zoo.getInstance().getCageByRace(Human.class).getAnimals().size());
        System.out.println("Propagating with humans");
        
       
        
        Male mg = new Male();
        h.setGender(mg);
        mg.setGenderOwner(h);
        
        Female fh = new Female();
        f.setGender(fh);
        fh.setGenderOwner(f);
        //f.setMaxNumberOfEggs(2);
        
        
        fh.ovulate();
        h.propagate(f);
        System.out.println("Human cage contains: "+Zoo.getInstance().getCageByRace(Human.class).getAnimals().size());
        
        //propagate with a parrot, which is not going to work
        Female fp = new Female();
        i.setGender(fp);
        fp.setGenderOwner(i);
        
        System.out.println("Human trying to propagate with a parrot");
        h.propagate(i);
        System.out.println("Human cage contains: "+Zoo.getInstance().getCageByRace(Human.class).getAnimals().size());
        
        
        //UE 005
        System.out.println("\n\n\n\nUE005");
        System.out.println("Bird test");
        System.out.println("Parrot cage contains: "+Zoo.getInstance().getCageByRace(Parrot.class).getAnimals().size());
        
        Parrot mp = new Parrot();
        Male mpg = new Male();
        
        mp.setGender(mpg);
        mpg.setGenderOwner(mp);
        
        
        fp.ovulate();
        mp.propagate(i);
        
        
        System.out.println("Parrot cage contains: "+Zoo.getInstance().getCageByRace(Parrot.class).getAnimals().size());
        
        i.hatchEggs(i.giveBirth()); //hatch eggs adds animals, however that is already done inside the animal constructor as soon as its created in the egg
        
        System.out.println("Reptile test");
        
        System.out.println("Crocodile cage contains: "+Zoo.getInstance().getCageByRace(Crocodile.class).getAnimals().size());
        Crocodile mc = new Crocodile("croxodile");
        Crocodile fc = new Crocodile("fcroxodile");
        
        Male mcr = new Male();
        Female fcr = new Female();
        
        
        mc.setGender(mcr);
        fc.setGender(fcr);
        
        mcr.setGenderOwner(mc);
        fcr.setGenderOwner(fc);
        
        
        fcr.ovulate();
        
        mc.propagate(fc);
        
        fc.hatchEggs(fc.giveBirth()); //actually unnecessary
        
        System.out.println("Crocodile cage contains: "+Zoo.getInstance().getCageByRace(Crocodile.class).getAnimals().size());
        
        
        System.out.println("\n\n\n\nUE006");
        
        System.out.println("Human making love with partner");
        System.out.println("HALLO: " + h.getPartner());
        h.marry(f);
        System.out.println("HALLO: " + h.getPartner());

        h.makeLove(f);
        
        System.out.println("Human making love with itself");
        h.makeLove();
        f.makeLove();
        
        System.out.println("Human cheating");
       
        
        Human ch = new Human("Cheat female","white",80);
        
        Female cf = new Female();
        
        ch.setGender(cf);
        
        cf.setGenderOwner(ch);
        
        
        
        h.makeLove(ch);
        
        

    }
}
