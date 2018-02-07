 /*
 * Test class
 */
package Init;

import com.gydo194.animalkingdom.animals.reptiles.Crocodile;
import com.gydo194.animalkingdom.animals.mammals.Human;
import com.gydo194.animalkingdom.animals.mammals.AsianElephant;
import com.gydo194.animalkingdom.animals.mammals.AfricanElephant;
import com.gydo194.animalkingdom.animals.mammals.WhiteMouse;
import com.gydo194.animalkingdom.animals.mammals.GrayMouse;
import com.gydo194.animalkingdom.animals.reptiles.Snake;
import com.gydo194.animalkingdom.animals.birds.Platypus;
import com.gydo194.animalkingdom.animals.birds.Penguin;
import com.gydo194.animalkingdom.animals.birds.Parrot;
import com.gydo194.animalkingdom.Animal;
import com.gydo194.animalkingdom.Cage;
import com.gydo194.animalkingdom.Zoo;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public class Starter {

    private static void printComm(Animal a) {
        System.out.println(a.communicate());
    }
    private static void printMove(Animal a) {
        System.out.println(a.move());
    }

    public static void main(String[] args) {
        System.out.println("Starting application...");

        //declare and instantiate cages
        Cage elephantCage = new Cage();
        Cage mouseCage = new Cage();
        Cage humanCage = new Cage(); //feels kinda bad, almost like putting innocent people in jail
        Cage penguinCage = new Cage();
        Cage platypusCage = new Cage();
        Cage parrotCage = new Cage();
        Cage crocodileCage = new Cage();
        Cage snakeCage = new Cage();

        //elephants
        AfricanElephant ae = new AfricanElephant("African Elephant 0");
        AsianElephant ase = new AsianElephant("Asian Elephant 0");

        //mouses
        GrayMouse gm = new GrayMouse("Gray Mouse 0");
        WhiteMouse wm = new WhiteMouse("White Mouse 0");

        //everything else
        Human h = new Human("Human 0", "white", 80.0);

        Parrot pa = new Parrot("Parrot 0", "RaInBoW cOlOrEd");
        Penguin pe = new Penguin("Pingu the Penguin");
        Platypus pl = new Platypus("Platypus 0");
        Crocodile cr = new Crocodile("Crocodile 0");
        Snake sn = new Snake("Snake 0");

        //go capture those animals in the wild now and push() them >>into the cage() 
        elephantCage.addAnimal(ae);
        elephantCage.addAnimal(ase);

        mouseCage.addAnimal(gm);
        mouseCage.addAnimal(wm);

        humanCage.addAnimal(h);

        penguinCage.addAnimal(pe);

        platypusCage.addAnimal(pl);

        parrotCage.addAnimal(pa);

        crocodileCage.addAnimal(cr);

        snakeCage.addAnimal(sn);

        //communication
        /*
        printComm(ae);
        printComm(ase);
        printComm(gm);
        printComm(wm);
        printComm(h);
        printComm(pa);
        printComm(pe);
        printComm(pl);
        printComm(cr);
        printComm(sn);
         */
        
        
        
        
        
        //build the zoo
        
        Zoo zoo = new Zoo();
        
        zoo.addCage(elephantCage);
        zoo.addCage(mouseCage);
        zoo.addCage(humanCage); //still feels bad
        zoo.addCage(penguinCage);
        zoo.addCage(platypusCage);
        zoo.addCage(parrotCage);
        zoo.addCage(crocodileCage);
        zoo.addCage(snakeCage);
        
        
        
        
        
        
        /*
        //for the principle's sake, get the animals from their respective cages.
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(elephantCage.getAnimal(0));
        animals.add(elephantCage.getAnimal(1));
        animals.add(mouseCage.getAnimal(0));
        animals.add(mouseCage.getAnimal(1));
        animals.add(humanCage.getAnimal(0));
        animals.add(penguinCage.getAnimal(0));
        animals.add(platypusCage.getAnimal(0));
        animals.add(parrotCage.getAnimal(0));
        animals.add(crocodileCage.getAnimal(0));
        animals.add(snakeCage.getAnimal(0));
        /*
        for(Animal a : animals) {
            printComm(a);
            
            a.dumpInfo();
        }
         
        
        for(Animal a : animals) {
            System.out.print("Sound: ");
            printComm(a);
            a.dumpInfo();
            System.out.print("\n\n\n");
        }
        */
        
        
        
        /*
        //iterate over zoo's cages
        for(Cage c : zoo.getCages()) {
            System.out.println("Looping cage");
            //iterate over animals
            for(Animal a : c.getAnimals()) {
                System.out.println("Looping animal");
                printComm(a);
                printMove(a);
                a.dumpInfo();
                System.out.print("\n\n\n\n");
            }
        }
        */
        
        
        
    }
}
