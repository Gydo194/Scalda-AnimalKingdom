/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.animalInterfaces;

import com.gydo194.animalkingdom.Egg;
import java.util.ArrayList;

/**
 *
 * @author gydo194
 */
public interface IBird extends IEggLayer  {
    
    public String fly();
    public void hatchEggs(ArrayList<Egg> layedEggs);
    
}
