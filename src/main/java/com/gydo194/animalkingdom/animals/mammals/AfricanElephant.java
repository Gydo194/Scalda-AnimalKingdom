/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.animals.mammals;

import com.gydo194.animalkingdom.Cage;
import com.gydo194.animalkingdom.animals.mammals.Elephant;

/**
 *
 * @author gydo194
 */
public class AfricanElephant extends Elephant {
    
    public AfricanElephant() {
        super("DEFAULT AFRICAN ELEPHANT NAME",50); //literally no idea what ear size it is, what unit is it even!
        this.maxNumberOfEggs = 2;
        
    }
    
    public AfricanElephant(String name) {
        super(name,1);
    }

    
}
